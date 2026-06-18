class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      List<List<Integer>>ans = new ArrayList<>();
      List<Integer> res= new ArrayList<>();
      ans.add(res);
      for(int i=0;i<nums.length;i++){
        int size = ans.size();
       
        for(int j=0;j<size;j++){
             List<Integer>temp = new ArrayList<>(ans.get(j));
            temp.add(nums[i]);
            ans.add(temp);
        }
      }
      return ans;
    }
}
