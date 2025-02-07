import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int[] result = new int[queries.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> colorCount = new HashMap<>();
        HashSet<Integer> distinctColors = new HashSet<>();

        for (int i = 0; i < queries.length; i++) {
            int ball = queries[i][0];
            int color = queries[i][1];

            if (map.containsKey(ball)) {
                int oldColor = map.get(ball);
                colorCount.put(oldColor, colorCount.get(oldColor) - 1);
                if (colorCount.get(oldColor) == 0) {
                    distinctColors.remove(oldColor);
                }
            }

            map.put(ball, color);
            colorCount.put(color, colorCount.getOrDefault(color, 0) + 1);
            distinctColors.add(color);
            result[i] = distinctColors.size();
        }

        return result;
    }
}