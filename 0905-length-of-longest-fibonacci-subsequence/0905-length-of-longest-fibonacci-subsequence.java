import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(arr[i], i);
        }

        int maxLen = 0;
        int[][] dp = new int[n][n];

        for (int k = 0; k < n; k++) {
            for (int j = 0; j < k; j++) {
                int diff = arr[k] - arr[j];
                if (diff < arr[j] && indexMap.containsKey(diff)) {
                    int i = indexMap.get(diff);
                    dp[j][k] = dp[i][j] + 1;
                    maxLen = Math.max(maxLen, dp[j][k]);
                }
            }
        }

        return maxLen == 0 ? 0 : maxLen + 2;
    }
}