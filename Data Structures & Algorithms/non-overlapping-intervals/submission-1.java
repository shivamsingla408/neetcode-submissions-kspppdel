class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans=0;
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int newmin = intervals[0][0];
        int newmax = intervals[0][1];
        if(n<=1)return 0;
        for(int i=1;i<n;i++){
           if(newmax>intervals[i][0]){
              newmax = Math.min(intervals[i][1],newmax);
              ans++;
           }
           else{
            newmin = intervals[i][0];
            newmax = intervals[i][1];
           }

        }
        return ans;
    }
}
