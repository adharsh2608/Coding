class Solution {
    public int maximumCount(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int negCount = binarySearchNegatives(nums);
        int posCount = binarySearchPositives(nums);
        
        return Math.max(negCount, posCount);
    }
    
    private int binarySearchNegatives(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    
    private int binarySearchPositives(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return nums.length - left;
    }
}