class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int dp[][] = new int[nums.length+1][2*sum+1];
        for(int i=0;i<=nums.length;i++){
            for(int j=0;j<2*sum+1;j++){
                dp[i][j]=-1;
            }
        }
        return dfs(nums,target,0,dp,sum);
    }
    int dfs(int[] nums , int target,int index,int[][] dp,int sum){
           if(index==nums.length && target==0){
            
            return 1;
           }
           if(index==nums.length && target!=0){
            return 0;
           }
           int col = target+sum;
           if (target < -sum || target > sum) return 0;
           if(dp[index][col]!=-1)return dp[index][col];
           int plus = dfs(nums,target-nums[index],index+1,dp,sum);
           int sub = dfs(nums,target+nums[index],index+1,dp,sum);
           return dp[index][col] =plus+sub;
    }
}
