class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtrack(ans,board,n,0);
        return ans;
    }
    public void backtrack(List<List<String>> ans,char[][] board ,int n,int index){
        if(index==n){
            List<String> copy = new ArrayList<>();
            for(char[] row: board){
                copy.add(new String(row));
            }
            ans.add(copy);
            return;
        }
        for(int row=0;row<n;row++){
            if(issafe(row,index, board,n)){
                board[row][index] = 'Q';
                backtrack(ans,board,n,index+1);
                board[row][index]='.';
            }
        }
    }
    private boolean issafe(int r,int c,char[][] board,int n){
        int supr = r;
        int supc=c;
        while(r>=0 && c>=0 ){
            if(board[r][c]=='Q'){
                return false;
            }
            r--;c--;
        }
        r = supr;
        c= supc;
        while(c>=0){
            if(board[r][c]=='Q'){
                return false;
            }
            c--;
        }
        
        c= supc;
        while(c>=0 && r<n){
            if(board[r][c]=='Q'){
                return false;
            }
          c--;
          r++;
        }
        return true;
    }
}
