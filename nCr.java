class Solution{

    static int nCr(int n, int r)

    {

        int mod=1000000007;
        if(r>n){
            return 0;
        }
        else if (r==n){
            return 1;
        }
        int [][]dp=new int[n+1][r+1];

        // n+1Cr=n-1Cr-1 +n-1Cr

        for(int i=0;i<n+1;i++){
            for(int j=0;j<r+1;j++){
                if(i==j || j==0 || i==0){
                    dp[i][j]=1;
                }
                else{
                    dp[i][j]=(dp[i-1][j]+dp[i-1][j-1])%mod;
                }
            }
        }
        return dp[n][r];
    }

}
