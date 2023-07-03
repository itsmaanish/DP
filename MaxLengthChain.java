class GfG
{
    int maxChainLength(Pair arr[], int n)
    {
       
       Arrays.sort(arr,Comparator.comparingDouble(o -> o.y));
       
       int chain = 1;
       int chainLast = arr[0].y;
       
       for(int i = 1;i<n;i++){
           if(arr[i].x > chainLast){
               chain++;
               chainLast = arr[i].y;
           }
       }
       
       return chain;
    }
}
