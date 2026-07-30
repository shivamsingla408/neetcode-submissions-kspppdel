class Solution {
    public boolean canFinish(int numCourses, int[][] pr) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());
        for (int[] p : pr) {
            adj.get(p[1]).add(p[0]);
            indegree[p[0]]++;              // p[0] has one more prerequisite
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.add(i); // courses with no prereqs
        }

        int finished = 0;
        while (!q.isEmpty()) {
            int course = q.poll();
            finished++;
            for (int next : adj.get(course)) {
                if (--indegree[next] == 0) q.add(next);
            }
        }
        return finished == numCourses;     // if all courses got processed, no cycle
    }
}