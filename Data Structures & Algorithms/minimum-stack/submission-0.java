class MinStack {
    Stack<Pair<Integer,Integer>> st = new Stack<>();
    public MinStack() {
        Stack<Pair<Integer,Integer>> st = new Stack<>();
    }
    
    public void push(int val) {
        if(st.empty()){
            st.push(new Pair<>(val,val));
        }
        else{
            st.push(new Pair<>(val,Math.min(val,st.peek().getValue())));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
       return st.peek().getKey();
    }
    
    public int getMin() {
        return st.peek().getValue();
    }
}
