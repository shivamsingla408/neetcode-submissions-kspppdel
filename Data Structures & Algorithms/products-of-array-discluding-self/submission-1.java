class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int prev=0;
        int ansi=1;
        for(int i=0;i<nums.length;i++){
           if(nums[i]==0){
            prev++;
            continue;
            
           }
           else
           ansi=ansi*nums[i];
        }
        if(prev>1){
            for(int i=0;i<nums.length;i++){
                ans[i]=0;
            }
        }
        else if(prev==1){
          for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ans[i]=ansi;
            }
            else{
                ans[i]=0;
            }
          }
        }
        else{
            for(int i=0;i<nums.length;i++){
                ans[i]=ansi/nums[i];
            }
        }
        return ans;
    }
}  
