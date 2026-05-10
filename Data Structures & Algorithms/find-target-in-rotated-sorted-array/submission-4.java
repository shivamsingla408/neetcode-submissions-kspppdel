class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h= nums.length-1;
        while(l<h){
            int mid= (l+h)/2;
            if(nums[mid]>nums[h]){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        int r=0;
        int temp=l;
        while(r<=l){
          int mid=(r+l)/2;
          if(nums[mid]==target)return mid;
          else if(nums[mid]>=target)l=mid-1;
          else r=mid+1;
        }

        r=nums.length-1;
         while(temp<=r){
          int mid=(r+temp)/2;
          if(nums[mid]==target)return mid;
          else if(nums[mid]>=target)r=mid-1;
          else temp=mid+1;
        }
        return -1;
    }
}
