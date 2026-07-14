class Solution {
    public boolean isNStraightHand(int[] hand, int groupsize) {
        int n = hand.length;
        if(n%groupsize!=0)return false;
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int i=0;i<n;i++){
            mp.put(hand[i],mp.getOrDefault(hand[i],0)+1);

        }
        while(!mp.isEmpty()){
            int curr =mp.keySet().iterator().next();
            for(int i=0;i<groupsize;i++){
                if(!mp.containsKey(curr+i))return false;
                int curkey = mp.get(curr+i);
                if(curkey>1)
                mp.put(curr+i,curkey-1);
                else mp.remove(curr+i);

            }
        }
        return true;
    }
}
