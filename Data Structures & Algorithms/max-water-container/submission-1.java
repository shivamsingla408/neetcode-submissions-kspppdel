class Solution {
    public int maxArea(int[] heights) {
        int maxi =0;
        int i=0;
        int j = heights.length-1;
        while(i<j){
            int ansi = (j-i)*Math.min(heights[i],heights[j]);
            maxi = Math.max(maxi,ansi);
            if(heights[i]>=heights[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return maxi;
    }
}
