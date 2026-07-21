class Solution {
      int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int maxAreaOfIsland(int[][] grid) {
        int max =0 ;
      
        int n  = grid.length,m=grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    max = Math.max(dp(grid,i,j),max);
                }
            }
        }
        return max;
    }
    private int dp(int[][] grid , int row,int col){
            if(row>=grid.length || row<0 || col>=grid[0].length || col<0 || grid[row][col]==0){
                return 0;
            }
            int res=1;
            grid[row][col]=0;
            for(int[] d: dir){
                res+=dp(grid,row+d[0],col+d[1]);
            }
            return res;
        }
    
}
