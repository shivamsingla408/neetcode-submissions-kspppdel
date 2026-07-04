class Solution {
    public int minMeetingRooms(List<Interval> intervals) {
        if (intervals.isEmpty()) return 0;
        intervals.sort(Comparator.comparingInt(a -> a.start));

        PriorityQueue<Integer> heap = new PriorityQueue<>(); // stores end times
        for (Interval it : intervals) {
            if (!heap.isEmpty() && heap.peek() <= it.start) {
                heap.poll();          // earliest-ending room is free → reuse it
            }
            heap.offer(it.end);       // occupy a room with this meeting's end
        }
        return heap.size();           // rooms never freed = peak concurrency
    }
}