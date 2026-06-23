class Solution {
    public List<String> generateParenthesis(int n) {
        String temp = "";
        int open = n;
        int close = n;
        List<String> ans = new ArrayList<>();
        recur(ans,temp,open ,close);
        return ans;
    }
    public void recur(List<String> ans,String temp,int open, int close){
        if(open==0 && close==0){
            ans.add(new String(temp));
            return;
        }
        if(open!=0){
            String temp1= temp;
            temp1+='(';
            recur(ans,temp1,open-1,close);
        }
        if(close>open){
            String temp2 = temp;
            temp2+=')';
            recur(ans,temp2,open,close-1);
        }
    }
}
