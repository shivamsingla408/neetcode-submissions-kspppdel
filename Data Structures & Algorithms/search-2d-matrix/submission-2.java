class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length-1;
        int m = matrix[0].length-1;
        for(int i=0;i<=n;i++){
            if(target>=matrix[i][0] && target<=matrix[i][m]){
                int l = 0;
                int r= m;
                int mid=0;
                while(l<=r){
                    mid = (l+r)/2;
                  if(matrix[i][mid]==target)return true;
                  else if(matrix[i][mid]>target)r=mid-1;
                  else l=mid+1;
                }
                return false;
            }
            
        }
        return false;
    }
}
