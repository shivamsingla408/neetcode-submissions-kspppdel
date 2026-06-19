class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        recur(nums,target,cur,res,0);
        return res;
    }
    public void recur(int[] nums, int target , List<Integer> cur,List<List<Integer>> res,int ind){
        if(target==0){
            res.add(new ArrayList(cur));
            return;
            }
        if(target<0 || ind>=nums.length)return ;
        cur.add(nums[ind]);
        recur(nums,target-nums[ind],cur,res,ind);
        cur.remove(cur.size()-1);
        recur(nums,target,cur,res,ind+1);
    }
}
