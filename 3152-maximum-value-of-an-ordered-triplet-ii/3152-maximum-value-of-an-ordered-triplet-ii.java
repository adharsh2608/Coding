class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxValue = 0;
        int n = nums.length;
        
        if (n < 3) return 0;
        
        int maxSoFar = nums[0];
        int maxDiff = 0;
        
        for (int k = 2; k < n; k++) {
            maxDiff = Math.max(maxDiff, maxSoFar - nums[k-1]);
            maxSoFar = Math.max(maxSoFar, nums[k-1]);
            maxValue = Math.max(maxValue, (long)maxDiff * nums[k]);
        }
        
        return maxValue;
    }
}