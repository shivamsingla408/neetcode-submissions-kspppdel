class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq= new PriorityQueue<>(Comparator.comparing(a->a[0]));
        for(int[] pos: points){
            int dist = pos[0]*pos[0]+pos[1]*pos[1];
            pq.offer(new int[]{dist,pos[0],pos[1]});

        }
        int[][] result = new int[k][2];
        for(int i=0;i<k;i++){
            int[] ps = pq.poll();
            result[i]=new int[]{ps[1],ps[2]};
        }
        return result;

    }
}
