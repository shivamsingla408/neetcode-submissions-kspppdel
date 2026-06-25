class Solution {
    public List<List<String>> partition(String s) {
        HashSet<List<String>> ans = new HashSet<>();
        List<String> temp = new ArrayList<>();
        subs(ans,temp,s,0);
        return new ArrayList<>(ans);
    }
    public void subs(HashSet<List<String>> ans ,List<String> temp,String s,int i ){
        if(i==s.length()){
        ans.add(new ArrayList<>(temp));
                return;
        }
        for(int index=i;index<s.length();index++){
            if(check(s,i,index)){
                temp.add(s.substring(i,index+1));
                subs(ans,temp,s,index+1);
                temp.remove(temp.size()-1);
            }

        }
       
    }
    public boolean check(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end))return false;
            start++;end--;

        }
        return true;
    }
}
