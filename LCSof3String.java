 int LCSof3(String a, String b, String c, int n1, int n2, int n3) 
    { 
        int dp[][][] = new int[n1+1][n2+1][n3+1];
        for(int i = 1;i<=n1;i++){
            for(int j = 1;j<=n2;j++){
                for(int k = 1;k<=n3;k++){
                    if(a.charAt(i-1) == b.charAt(j-1) && a.charAt(i-1) == c.charAt(k-1)){
                        dp[i][j][k] = dp[i-1][j-1][k-1]+1;
                    }else{
                        dp[i][j][k] = Math.max(dp[i-1][j][k], Math.max(dp[i][j-1][k], dp[i][j][k-1]));
                    }
                }
            }
        }
        return dp[n1][n2][n3];
    }
