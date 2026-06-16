class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char task: tasks){
            count[task-'A']++;
        }
        int maxf = Arrays.stream(count).max().getAsInt();
        int maxc = 0;
        for(int i: count){
            if(i==maxf){
                maxc++;
            }
        }
        int time = (maxf-1)*(n+1) + maxc;
        return Math.max(tasks.length,time);
    }
}
