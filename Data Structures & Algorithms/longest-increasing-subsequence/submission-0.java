class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        int ans = findlength(nums,0,-1,dp,n);
        return ans;
    }
    int findlength(int[] nums , int index , int prev , int[][] dp,int n){
        if(index==n)return 0;
        if(dp[index][prev+1]!=-1)return dp[index][prev+1];
        int nottake = findlength(nums,index+1,prev,dp,n);
        if(prev==-1 || nums[index]>nums[prev]){
            nottake = Math.max(nottake,1+findlength(nums,index+1,index,dp,n));
        }
        return dp[index][prev+1]=nottake;
    }

}
