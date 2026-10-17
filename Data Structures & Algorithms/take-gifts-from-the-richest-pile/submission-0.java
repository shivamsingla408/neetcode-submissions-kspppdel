public class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int g : gifts) pq.offer(g);

        for (int t = 0; t < k; t++) {
            int n = pq.poll();
            pq.offer((int) Math.floor(Math.sqrt(n)));
        }

        long sum = 0;
        while (!pq.isEmpty()) sum += pq.poll();
        return sum;
    }
}