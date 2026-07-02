class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        List<int[]> ans = new ArrayList<>();
        if(n==0 || n==1)return intervals;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int newmin = intervals[0][0];
        int newmax = intervals[0][1];
        for(int i=1;i<n;i++){
            if(newmax>=intervals[i][0]){
                newmax = Math.max(newmax,intervals[i][1]); 
            }
            else{
                ans.add(new int[]{newmin,newmax});
                newmin = intervals[i][0];
                newmax=intervals[i][1];
            }
        }
        ans.add(new int[]{newmin,newmax});
        return ans.toArray(new int[ans.size()][2]);
    }
}
