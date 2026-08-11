class Solution {
public:
    int mandist(vector<vector<int>>& points, int p1,int p2){
        return abs(points[p1][0]-points[p2][0])+abs(points[p1][1]-points[p2][1]);
    }
    int minCostConnectPoints(vector<vector<int>>& points) {
      int n = points.size();  priority_queue<pair<int,int>,vector<pair<int,int>>,greater<pair<int,int>>>pq;
    vector<bool> setstate(n,false);
    pq.push({0,0});
    int mincost =0;
    while(pq.size()>0){
        auto p = pq.top();
        int wt = p.first;
        int node=p.second;
        pq.pop();
        if(setstate[node]==true)continue;
        setstate[node]=true;
        mincost+=wt;
        for(int i=0;i<n;i++){
            if(!setstate[i]){
               int edgewt = mandist(points,node,i);
               pq.push({edgewt,i});
            }

            
        }
    }

return mincost;
    }
};
