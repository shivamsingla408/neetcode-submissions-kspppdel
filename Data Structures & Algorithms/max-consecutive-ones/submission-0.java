class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
            {
               
                count++;
                 if(i==nums.length-1){
                    maxc = Math.max(maxc,count);
                }
            }
            else{

                maxc = Math.max(maxc,count);
                count=0;
            }
        }
        return maxc;
    }
}