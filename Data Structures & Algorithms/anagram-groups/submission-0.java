class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> mp = new HashMap<>();

        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String b = new String(c);
            if(!mp.containsKey(b)){
                mp.put(b,new ArrayList<String>());
            }
            mp.get(b).add(s);
        }
        return new ArrayList(mp.values());
    }
}
