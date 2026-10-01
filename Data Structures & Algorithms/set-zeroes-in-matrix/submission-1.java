class Solution {
    public void setZeroes(int[][] matrix) {
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
                for(int k=0;k<matrix.length;k++){
                    if(matrix[k][j]==0)continue;
                    matrix[k][j]  = -1;
                }
                 for(int k=0;k<matrix[0].length;k++){
                    if(matrix[i][k]==0)continue;
                    matrix[i][k]  = -1;
                }
            }
        }
       }
       for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==-1){
                matrix[i][j]=0;
            }
        }
       }
    
    }
}
