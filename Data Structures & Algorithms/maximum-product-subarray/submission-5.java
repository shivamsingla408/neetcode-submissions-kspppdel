class Solution {
    public int maxProduct(int[] nums) {
        int res = nums[0];
        int curmax = 1,curmin=1;
        for(int num : nums){
            int temp = num*curmax;
            curmax = Math.max(Math.max(curmax*num,curmin*num),num);
            curmin = Math.min(Math.min(temp,curmin*num),num);
            res = Math.max(curmax,res);
        }
        return res;
    }
}
