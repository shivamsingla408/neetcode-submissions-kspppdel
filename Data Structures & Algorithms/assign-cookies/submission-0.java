public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        int res = 0;

        for (int i : g) {
            int minIdx = -1;
            for (int j = 0; j < s.length; j++) {
                if (s[j] < i) continue;

                if (minIdx == -1 || s[minIdx] > s[j]) {
                    minIdx = j;
                }
            }

            if (minIdx != -1) {
                s[minIdx] = -1;
                res++;
            }
        }

        return res;
    }
}