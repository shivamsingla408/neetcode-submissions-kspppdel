class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=-1;
            }
        }
        int ans = path(m-1,n-1,dp);
        return ans;
    }
    int path(int i , int j , int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==0 && j==0)return 1;
          int left = path(i-1,j,dp);
        int up = path(i,j-1,dp);
      dp[i][j] = up+left;
        return up+left;
    }
}
