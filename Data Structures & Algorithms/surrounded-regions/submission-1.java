class Solution {
    private int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
    private int r ,c;
    public void solve(char[][] board) {
        r = board.length;
        c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                // DFS from border 'O's, not from 'X'
                if((i==0 || i==r-1 || j==0 || j==c-1) && board[i][j]=='O'){
                    dfs(board,i,j);
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]=='O') board[i][j]='X';        // enclosed -> X
                else if(board[i][j]=='P') board[i][j]='O';   // safe -> restore O
            }
        }
    }
    private void dfs(char[][] board, int row,int col){
        if(row<0 || row>=r || col<0 || col>=c || board[row][col]!='O'){
            return;
        }
        board[row][col]='P';                    // mark visited BEFORE recursing
        for(int[] d : dir){
            dfs(board,row+d[0],col+d[1]);        // apply full direction vector
        }
    }
}