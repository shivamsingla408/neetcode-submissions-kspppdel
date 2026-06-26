class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length()==0)return ans;
        String output = "";
        int index = 0;
        String mapping[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"} ;
        recur(digits,ans,output,index,mapping);
        return ans;
    }
    public void recur(String digits,List<String> ans,String output,int index,String mapping[] ){
        if(index>=digits.length()){
            ans.add(output);
            return ;
        }
        int number = digits.charAt(index)-'0';
        String value = mapping[number];
        for(int i=0;i<value.length();i++){
            recur(digits,ans,output+value.charAt(i),index+1,mapping);

        }
    }
}
