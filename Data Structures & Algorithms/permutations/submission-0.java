class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recur(nums,ans,temp,freq);
        return ans;
    }
    public void recur(int[] nums, List<List<Integer>> ans ,List<Integer> temp,         boolean freq[]){
        if(nums.length==temp.size()){
            ans.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                temp.add(nums[i]);
                recur(nums,ans,temp,freq);
                temp.remove(temp.size()-1);
                freq[i]=false;

            }
        }
    }
}
