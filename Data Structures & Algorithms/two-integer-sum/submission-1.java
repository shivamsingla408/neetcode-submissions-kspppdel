class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] out = new int[2];
        if(nums.length<2)return out;
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                
               if(nums[i]+nums[j]==target ){
                if(i==j)continue;
                out[0]=i;
                out[1]=j;
               }
            }
        }
        Arrays.sort(out);
        return out;
    }
}
