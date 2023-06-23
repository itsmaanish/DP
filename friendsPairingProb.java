class Solution
{
    public long countFriendsPairings(int n) 
    { 
        int mod=1000000007;
         long dp[]=new long[n+1];
         for(int i=0;i<=n;i++){
             if(i<=2){
                 dp[i]=i;
             }
             else{
                 dp[i]= (dp[i-1] + (i-1) * dp[i-2])%mod;
             }
         }
         return dp[n];
    }
}  
