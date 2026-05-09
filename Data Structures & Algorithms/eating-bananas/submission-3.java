class Solution {
    public int total(int[] piles , int index){
         int ans =0;
         for(int i=0;i<piles.length;i++){
           ans +=  Math.ceil((double) piles[i] / index);
         }
         return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int n = piles.length-1;
        int maxi=piles[n];
        int l=1;
        
       while(l<=maxi){
        int mid = (l+maxi)/2;
        int tot = total(piles,mid);
        if(tot<=h){
            maxi=mid-1;
          }
          else{
            l=mid+1;
          }
       }
       return l;
    }
}
