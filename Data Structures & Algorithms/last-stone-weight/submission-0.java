class Solution {
    public int lastStoneWeight(int[] stones) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      for(int s: stones){
        pq.offer(s);
      } 
      while(pq.size()>1){
        int first = pq.poll();
        int second = pq.poll();
        if(first>second){
            pq.offer(first-second);
        }
      }
      pq.offer(0);
      return pq.peek();
    }
}
