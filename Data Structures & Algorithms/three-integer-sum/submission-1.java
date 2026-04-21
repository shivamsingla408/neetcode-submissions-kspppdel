class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            int a=nums[i];
            if(i>0 && nums[i]==nums[i-1])continue;
            int b = i+1;
            int c = n-1;
            while(b<c){
                if(a+nums[b]+nums[c]>0){
                    c--;
                }
                else if(a+nums[b]+nums[c]<0){
                    b++;
                }
                else{
                  List<Integer> temp = new ArrayList<>();
                  temp.add(a);
                  temp.add(nums[b]);
                  temp.add(nums[c]);
                  ans.add(temp);
                  while(b<c && nums[b]==nums[b+1])b++;
                  while(b<c && nums[c]==nums[c-1])c--;
                  b++;
                  c--;
                }
            }
           
           

        }
         return ans;
    }
}
