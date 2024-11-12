import java.util.Arrays;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] result = new int[queries.length];
        
        int[] maxBeautySoFar = new int[items.length + 1];
        
        for (int i = 0; i < items.length; i++) {
            maxBeautySoFar[i + 1] = Math.max(maxBeautySoFar[i], items[i][1]);
        }

        for (int i = 0; i < queries.length; i++) {
            int index = firstGreater(items, queries[i]);
            result[i] = maxBeautySoFar[index];
        }

        return result;
    }

    private int firstGreater(int[][] items, int query) {
        int left = 0, right = items.length;
        
        while (left < right) {
            int mid = (left + right) / 2;
            if (items[mid][0] > query) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left;
    }
}
