class Solution{
    static int longestSubsequence(int n, int arr[])
    {
    HashMap<Integer,Integer> map = new HashMap<>();
    int ans=1;
    for(int i=0;i<n;i++){
        int len=1;
        if(map.containsKey(arr[i]-1))
        len=Math.max(len,map.get(arr[i]-1)+1);
        
        if(map.containsKey(arr[i]+1))
        len=Math.max(len,map.get(arr[i]+1)+1);
        
        map.put(arr[i],len);
        ans=Math.max(ans,len);
    }
       return ans;
    }
}
