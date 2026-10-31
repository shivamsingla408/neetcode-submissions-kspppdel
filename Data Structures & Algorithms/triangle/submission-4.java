class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++){
            for(int j=0;j<triangle.size();j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        return dfs(0,0, triangle,dp);
    }
    private int dfs(int row, int col , List<List<Integer>> triangle,int[][] dp){
        if(row>=triangle.size()){
            return 0;
        }
        if(dp[row][col]!=Integer.MAX_VALUE)return dp[row][col];
        return dp[row][col] = triangle.get(row).get(col) + Math.min(dfs(row+1,col,triangle,dp) , dfs(row+1,col+1,triangle,dp));
    }
}