class Solution
{
public int maxSumIS(int a[], int n)  
	{  
	    int dp[]=new int[n],ans=0;
	    for(int i=0;i<n;i++){
	        dp[i]=a[i];
	        for(int j=0;j<i;j++){
	            if(a[j]<a[i]) dp[i]=Math.max(dp[i],dp[j]+a[i]);
	        }
	        ans=Math.max(ans,dp[i]);
	    }
	    return ans;
	} 
}
