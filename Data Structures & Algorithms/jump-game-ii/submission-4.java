class Solution {
    public int jump(int[] nums) {
    int count =0;
        for(int i=0;i<nums.length;i++){
            int l = i;
            if(i>=nums.length-1)return count;
             count++;
            int r = i+nums[i];
            if(r>=nums.length-1)return count;
            int maxi = 0;
            int nextl=0;
            while(l<=r){
                if(l==nums.length-1)return count;
                if(maxi<l+nums[l]){
                nextl = l;
                maxi = Math.max(maxi,l+nums[l]);
                }
                l++;

            }
           
            i = nextl-1;

        }
        return count;
    }
}
