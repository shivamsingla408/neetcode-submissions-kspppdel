class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int prev =0;
        int next=0;
        int maxi= 0;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                 int element = st.peek();st.pop();
                 if(st.empty()){
                    prev = -1;
                 }
                 else
                 prev = st.peek();
                 next = i;
                 maxi = Math.max(maxi,heights[element]*(next-prev-1));
            }
            st.push(i);
        }
        while(!st.empty()){
           next = n;
           int element = st.peek();st.pop();
           if(st.empty()){
                    prev = -1;
                 }
                 else
                 prev = st.peek();
                 maxi = Math.max(maxi,heights[element]*(next-prev-1));

        }
        
        return maxi;
    }
}
