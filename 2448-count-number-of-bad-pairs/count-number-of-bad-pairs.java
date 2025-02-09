import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long totalPairs = (long) nums.length * (nums.length - 1) / 2;
        long goodPairs = 0;

        for (int i = 0; i < nums.length; i++) {
            int transformedValue = nums[i] - i;
            goodPairs += map.getOrDefault(transformedValue, 0);
            map.put(transformedValue, map.getOrDefault(transformedValue, 0) + 1);
        }

        return totalPairs - goodPairs;
    }
}