class Solution {
public:
   int n;
   vector<vector<int>> dir = {{1,0},{-1,0},{0,-1},{0,1}};
    bool check(vector<vector<int>>& grid, int i,int j,int t, vector<vector<bool>>& visited){
        if(i>=n || i<0 || j>=n || j<0 || visited[i][j]==true || grid[i][j]>t)return false;
        visited[i][j]=true;
        if(i==n-1 && j==n-1)return true;

        for(auto &it : dir){
            int i_ = i+it[0];
            int j_ = j+it[1];
            if(check(grid,i_,j_,t,visited))return true;
        }
        return false;
    }
    int swimInWater(vector<vector<int>>& grid) {
         n = grid.size();
        int l = grid[0][0];
        int h=n*n;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<grid[0].size();j++){
        //         h = max(grid[i][j],h);
        //     }
        // }
        int res=0;
        while(l<=h){
            int mid = (l+h)/2;
            vector<vector<bool>> visited(n,vector<bool>(n,false));
            if(check(grid,0,0,mid,visited)){
                res=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }
};
