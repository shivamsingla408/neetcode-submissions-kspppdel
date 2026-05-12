class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l=0;
        int r=0;
        int n = nums1.length;
        int m = nums2.length;
        int i=0;
        int[] ans = new int[n+m];
        while(l<n && r<m){
           if(nums1[l]<=nums2[r]){
            ans[i]=nums1[l];
            l++;
           }
           else{
            ans[i]=nums2[r];
            r++;
           }
           i++;
        }
        while(l<n){
            ans[i]=nums1[l];
            l++;i++;
        }
         while(r<m){
            ans[i]=nums2[r];
            r++;i++;
        }
        if((n+m)%2!=0){
            int mid = (n+m)/2;
            return ans[mid];
        }
        int mid =(n+m)/2;
        return (double)(ans[mid-1]+ans[mid])/2;
    }
}
