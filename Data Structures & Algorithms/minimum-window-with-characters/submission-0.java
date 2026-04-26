class Solution {
    public String minWindow(String s, String t) {
        
        int n = s.length();
        int m = t.length();
        int si=0;
        int ans = Integer.MAX_VALUE;
        int count = 0;
        int l=0;
        int r=0;
        HashMap<Character,Integer> mp = new HashMap<>();

        for(int i=0;i<t.length();i++){
          mp.put(t.charAt(i),mp.getOrDefault(t.charAt(i),0)+1);
        }
        
        while(r<s.length()){
            if(mp.containsKey(s.charAt(r))){

            
            if(mp.get(s.charAt(r))>0){
                
                count++;
            }
            }
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)-1);
            while(count==m ){
                if(ans >=r-l+1){
                   ans = r-l+1;
                   si=l;
                }
                mp.put(s.charAt(l),mp.getOrDefault(s.charAt(l),0)+1);
                if(mp.get(s.charAt(l))>0){
                    count = count-1;
                   
                    }
                 
                 l++;
                  

            }
            r++;
           
        }
      if(ans==Integer.MAX_VALUE)return "";
      String ansi ="";
      for(int i=si;i<si+ans;i++){
        ansi+=s.charAt(i);
      }
      return ansi;
    }
}
