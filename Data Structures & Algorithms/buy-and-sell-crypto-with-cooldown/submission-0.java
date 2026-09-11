class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
      int dp[][] = new int[n][2];
      for(int i=0;i<n;i++){
        for(int j=0;j<2;j++){
            dp[i][j]=-1;
        }
      }
      return dfs(prices,0,dp,1);
    }
    int dfs(int[] prices,int i,int[][] dp , int buy){
        if(i>=prices.length)return 0;
        if(dp[i][buy]!=-1)return dp[i][buy];
         if(buy==1){
            return dp[i][buy]= Math.max(-prices[i]+dfs(prices,i+1,dp,0), dfs(prices,i+1,dp,1));
     }
    return dp[i][buy] = Math.max(prices[i]+dfs(prices,i+2,dp,1),dfs(prices,i+1,dp,0));
        
        
    }
}
