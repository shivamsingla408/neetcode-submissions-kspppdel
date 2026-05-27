class Solution {
    public int[] replaceElements(int[] arr) {
       int n = arr.length ;
       int[] ans = new int[n];
       int rightmax = -1;
       for(int i=n-1;i>=0;i--){
        ans[i] = rightmax;
        rightmax = Math.max(rightmax,arr[i]);
       }
       return ans;
    }
}