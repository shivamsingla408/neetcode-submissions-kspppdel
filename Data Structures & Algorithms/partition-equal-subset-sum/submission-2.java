class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int n =nums.length;
        int[][] dp = new int[n+1][sum+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j]=-1;
            }
        }
        boolean ans = find(0,nums,n,0 , sum,dp);
        return ans;
    }
    boolean find(int index, int[] nums , int n ,int cursum, int sum , int[][] dp){
        if(cursum==sum)return true;
        if(index==n)return false;
        
         if(dp[index][cursum]!=-1)return dp[index][cursum]==1;
        boolean nottake = find(index+1,nums,n,cursum,sum,dp);
        boolean take = find(index+1,nums,n,cursum+nums[index],sum-nums[index],dp);
        boolean result = take || nottake;
        dp[index][cursum] = result?1:0;
        return result;
    }
}
