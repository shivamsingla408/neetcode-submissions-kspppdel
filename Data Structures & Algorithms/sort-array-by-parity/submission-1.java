class Solution {
    public int[] sortArrayByParity(int[] nums) {
        ArrayList<Integer> ol = new ArrayList<>();
         ArrayList<Integer> el = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                el.add(nums[i]);
            }
            else{
                ol.add(nums[i]);
            }
        }
        int[] ans = new int[nums.length];
        for(int i=0;i<el.size();i++){
            ans[i] = el.get(i);
            
        }
         for(int i=0;i<ol.size();i++){
            ans[el.size()+i] = ol.get(i);
        }
        return ans;


    }
}