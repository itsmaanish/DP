class Solution 
{ 
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         
         int dp[][] = new int[n+1][W+1];
         for(int i=1;i<n+1;i++)
         {
             for(int j=1;j<W+1;j++)
             {
                 int v = val[i-1];
                 int w = wt[i-1];
        
               if(w<= j)   //valid
                {
                    int incprofit = v + dp[i-1][j-w];  //include
                    int profit = dp[i-1][j];    //exclude
                    dp[i][j] = Math.max(incprofit,profit);
                }
                else 
                {
                    int profit = dp[i-1][j];
                    dp[i][j] = profit;
                }
            }
        }
        return dp[n][W];
    }
}
