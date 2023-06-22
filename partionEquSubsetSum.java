class Solution {
    static int equalPartition(int N, int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return 0;
        } else {
            int S = sum / 2;
            int[][] dp = new int[N + 1][S + 1];
            for (int i = 0; i <= N; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= S; j++) {
                    if (arr[i - 1] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j - arr[i - 1]] | dp[i - 1][j];
                    }
                }
            }
            return dp[N][S];
        }
    }
}
