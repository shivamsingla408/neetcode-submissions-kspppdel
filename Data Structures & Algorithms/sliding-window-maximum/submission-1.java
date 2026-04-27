class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1)return nums;
        int[] ls = new int[nums.length-k+1];

        for(int i=0;i<nums.length-k+1;i++){
           int count =1;
            int temp = nums[i];
           for(int j=i+1;j<nums.length;j++){
                
                if(nums[j]>temp)temp =nums[j];
                count++;
                if(count==k){
                    ls[i] = temp;
                    break;
                }
           } 
               


            
        }
        return ls;
    }
}
