import java.util.HashMap;

public class Solution {
    public int minSubarray(int[] nums, int p) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int remainder = (int) (totalSum % p);
        if (remainder == 0) {
            return 0;
        }
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        prefixMap.put(0, -1);

        int minLength = nums.length;
        long prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int currentRemainder = (int) (prefixSum % p);
            int target = (currentRemainder - remainder + p) % p;
            if (prefixMap.containsKey(target)) {
                minLength = Math.min(minLength, i - prefixMap.get(target));
            }
            prefixMap.put(currentRemainder, i);
        }
        return minLength == nums.length ? -1 : minLength;
    

    }

}
