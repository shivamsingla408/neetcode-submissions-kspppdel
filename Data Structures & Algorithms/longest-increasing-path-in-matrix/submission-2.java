class Solution {
     int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public int longestIncreasingPath(int[][] matrix) {
        int ans=0;
        int[][] dp = new int[matrix.length+1][matrix[0].length+1];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
             dp[i][j] =-1;
            }
        }
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
              ans = Math.max(ans, dfs(i,j,matrix,Integer.MIN_VALUE,dp));
            }
        }

        return ans;
    }
    int dfs(int i , int j , int[][] matrix,int preval,int[][] dp){
        if(i<0 || i>=matrix.length || j<0 || j>=matrix[0].length || matrix[i][j]<=preval){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        int res =1;
        for(int[] dir: directions){
            res = Math.max(res,1+dfs(i+dir[0],j+dir[1],matrix,matrix[i][j],dp));
            
        }
        dp[i][j] = res;
        return res;

    }
}
