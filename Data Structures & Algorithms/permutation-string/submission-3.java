class Solution {
    public boolean checkInclusion(String s1, String s2) {
      int n2 = s1.length();
      int n= s2.length();
      
       Map<Character,Integer> mp = new HashMap<>();
      for(int i=0;i<n2;i++){
           
        
         mp.put(s1.charAt(i),mp.getOrDefault(s1.charAt(i),0)+1);
         
           
      }
      int need = mp.size();
      for(int i=0;i<n;i++){
        Map<Character,Integer> mp2 = new HashMap<>();
        int cur =0;
        for(int j=i;j<n;j++){
          char c = s2.charAt(j);
          mp2.put(c,mp2.getOrDefault(c,0)+1);
        
          if(mp.getOrDefault(c, 0)<mp2.get(c)){
             break;
          }
          
         
          if(mp.getOrDefault(c, 0)==mp2.get(c)){
            cur++;
          }
          
          if(cur==need)return true;
        }
      }
      return false;  
    }
}
