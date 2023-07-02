
class Solution 

{

    static int eggDrop(int n, int k) 
 {
      Integer[][] dp = new Integer[n+1][k+1];
     return solve(n,k, dp);
 }
 static int solve(int n, int k, Integer[][] dp){
     
     if(n==1)return k;
     if(k==0 || k==1)return k;
     if(dp[n][k] != null) return dp[n][k];
     int moves = Integer.MAX_VALUE;
     
     for(int i=1;i<=k;i++){
         int broken = solve(n-1,i-1,dp);
         int notBroken = solve(n,k-i,dp);
         int temp = 1+Math.max(broken , notBroken);
         moves = Math.min(moves, temp);
     }
     return dp[n][k] = moves;

 }

}
