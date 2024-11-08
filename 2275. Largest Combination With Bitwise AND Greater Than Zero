class Solution {
    public int largestCombination(int[] candidates) {
        int ans = 0;

        for (int i = 0; i < 24; i++) {
            int count = 0;
            for (int candidate : candidates) {
                if (((candidate >> i) & 1) != 0) {
                    count++;
                }
            }

            ans = Math.max(ans, count);
        }
        return ans;

    }
}
