class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount][coins.length];
        for(int i=0;i<amount;i++){
            for(int j=0;j<coins.length;j++){
                dp[i][j]=-1;
            }
        }
        return dfs(amount,coins,0,0,dp);
    }
    int dfs(int amount, int[] coins,int req,int ind,int[][] dp ){
        if(req==amount)return 1;
        if(req>amount || ind==coins.length)return 0;
        if(dp[req][ind]!=-1)return dp[req][ind];
        int take = dfs(amount,coins,req+coins[ind],ind,dp);
        int nottake = dfs(amount,coins,req,ind+1,dp);
        return dp[req][ind]=take+nottake;
    }
}
