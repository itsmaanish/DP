class Solution {
    public int editDistance(String s, String t) {
       // int[][] dist=new int[s.length()+1][t.length()+1];
       int prev[]=new int[t.length()+1];
       int curr[]=new int[t.length()+1];
       for(int i=0;i<=t.length();i++)
        prev[i]=i;
        for(int i=1;i<=s.length();i++)
        { curr[0]++;
            for(int j=1;j<=t.length();j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
              {  curr[j]=prev[j-1];
                  }
                else
               { 
                   curr[j]=Math.min(curr[j-1],prev[j]);
                curr[j]=1+Math.min(curr[j],prev[j-1]);
               }
            }
            for(int l=0;l<=t.length();l++)
              prev[l]=curr[l];
        }
        return curr[t.length()];
    }
}
