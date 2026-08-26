class Solution {
   
    vector<int>memo2;

public:
    int rob(vector<int>& nums) {
        if (nums.size() == 1) return nums[0];

        vector<int> memo(nums.size(),-1);
        vector<int> memo2(nums.size(),-1);
        return max(dfs(0, nums.size()-1,nums,memo), dfs(1, nums.size(),nums,memo2));
    }

private:
    int dfs(int i, int n,vector<int>& nums,vector<int> &memo) {
       if(i>=n)return 0;
       if(memo[i]!=-1)return memo[i];
       memo[i] = max(nums[i]+dfs(i+2,n,nums,memo),dfs(i+1,n,nums,memo));
       return memo[i];

    }     
};