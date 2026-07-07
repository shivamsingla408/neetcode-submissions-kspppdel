class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                maxi = Math.max(maxi,nums[i]);
            }
            else{
                maxi=0;
                break;
            }
        }
        if(maxi==0){
        for(int i=0;i<nums.length;i++){
          sum = sum+nums[i];
          if(sum>0 ){
            maxi = Math.max(sum,maxi);
          }
         
          else{
            sum=0;
          }
        }
        }
        return maxi;
    }
}
