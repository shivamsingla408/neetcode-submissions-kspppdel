class Solution {
public:
    int networkDelayTime(vector<vector<int>>& times, int n, int k) {
        // adjacency list: adj[u] = {(v, weight), ...}
        vector<vector<pair<int,int>>> adj(n + 1);
        for (auto& it : times) {
            adj[it[0]].push_back({it[1], it[2]});   // u -> v with weight w
        }

        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> pq;
        vector<int> dist(n + 1, 1e9);   // size n+1 for 1-indexed nodes
        dist[k] = 0;
        pq.push({0, k});

        while (!pq.empty()) {
            int wt = pq.top().first;
            int node = pq.top().second;
            pq.pop();                    // Bug 1 fix: actually remove it

            if (wt > dist[node]) continue;   // skip stale entries

            for (auto& [next, edwt] : adj[node]) {   // Bug 2 fix: only node's edges
                if (wt + edwt < dist[next]) {
                    dist[next] = wt + edwt;
                    pq.push({dist[next], next});
                }
            }
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {   // Bug 3/4 fix: check all nodes 1..n
            ans = max(ans, dist[i]);
        }
        return ans == 1e9 ? -1 : ans;    // unreachable node → -1
    }
};