class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int pre[] =new int[n];
        int suf[] = new int[n];
        int maxi=0;
        for(int i=0;i<n;i++){
            pre[i]= Math.max(height[i],maxi);
            maxi = Math.max(height[i],maxi);
        }
        maxi=0;
        for(int j=n-1;j>=0;j--){
            suf[j] = Math.max(maxi,height[j]);
            maxi = Math.max(maxi,height[j]);
        }
        int res=0;
        for(int i=0;i<n;i++){
            res+=Math.min(pre[i],suf[i])-height[i];
        }
        return res;
    }
}
