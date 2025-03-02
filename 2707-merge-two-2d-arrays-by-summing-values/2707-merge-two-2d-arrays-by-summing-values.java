import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> merged = new HashMap<>();
        
        for (int[] num : nums1) {
            merged.put(num[0], merged.getOrDefault(num[0], 0) + num[1]);
        }
        
        for (int[] num : nums2) {
            merged.put(num[0], merged.getOrDefault(num[0], 0) + num[1]);
        }
        
        List<int[]> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : merged.entrySet()) {
            result.add(new int[]{entry.getKey(), entry.getValue()});
        }
        
        result.sort((a, b) -> a[0] - b[0]);
        
        int[][] output = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        
        return output;
    }
}