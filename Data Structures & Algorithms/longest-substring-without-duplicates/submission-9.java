class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxi=1;
        char[] arr = s.toCharArray();
        int n= arr.length;
        if(n==0)return 0;
        if(n==1)return 1;
        HashMap<Character,Integer> mp = new HashMap<>();
        mp.put(arr[0],0);
        int in=0;
        for(int i=1;i<n;i++){
            if(mp.containsKey(arr[i])){
               in = Math.max(mp.get(arr[i])+1,in);     
            }
            
                mp.put(arr[i],i);
            
            maxi = Math.max(maxi,i-in+1);

        }
        return maxi;
    }
}
