class Solution {
    public int dfs(int[] coins , int amount , int[] dp){
        if(amount == 0)return 0;
        if(dp[amount]!=Integer.MAX_VALUE)return dp[amount];
        int res = (int) 1e9;
        for(int coin : coins){
            if(amount-coin>=0){
                
                res = Math.min(res,1+dfs(coins,amount-coin,dp));
            }
        }
        dp[amount] = res;
        return dp[amount];
    }
    public int coinChange(int[] coins, int amount) {
      
      int dp[]= new int[amount+1];
      for(int i=0;i<=amount;i++){
        dp[i] = Integer.MAX_VALUE;
      }
int mincoins = dfs(coins,amount,dp);
return (mincoins>=1e9)?-1:mincoins;
        
    }
}
