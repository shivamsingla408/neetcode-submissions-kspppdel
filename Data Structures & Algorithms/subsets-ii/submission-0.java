class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        List<Integer> topi= new ArrayList<>();
        ans.add(new ArrayList<>(topi) );
        subset(nums,ans,topi,0);
        return new ArrayList<>(ans);
    }
    public void subset(int[] nums , Set<List<Integer>> ans ,List<Integer> topi,int index ){
        if(index>=nums.length)return ;
        topi.add(nums[index]);
        ans.add(new ArrayList<>(topi));
        subset(nums,ans,topi,index+1);
        topi.remove(topi.size()-1);
        subset(nums,ans,topi,index+1);

    }
}
