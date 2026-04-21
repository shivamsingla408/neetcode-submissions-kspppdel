class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int mini =prices[0];
        for(int i=0;i<prices.length;i++){
            max = Math.max(max,prices[i]-mini);
            mini = Math.min(prices[i],mini);
        }
        return max;
    }
}
