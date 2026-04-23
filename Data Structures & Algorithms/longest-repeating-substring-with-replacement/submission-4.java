class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
        int r=0;
        int l=0;
        int maxf=0;
        int n= s.length();
        HashMap<Character,Integer> mp = new HashMap<>();
        while(r<n){
             mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0)+1);
             maxf= Math.max(maxf,mp.get(s.charAt(r)));
             while((r-l+1)-maxf>k){
              mp.put(s.charAt(l), mp.get(s.charAt(l)) - 1);
             
              l++;
              
             }
             

             
             maxlen = Math.max(maxlen,r-l+1);
             r++;
             
        }
        return maxlen;
    }
}
