class Solution {
    public int longestNiceSubarray(int[] nums) {
        int n = nums.length;
        int maxLength = 1; 
        for (int i = 0; i < n; i++) {
            int currAnd = nums[i];
            int length = 1;
            for (int j = i + 1; j < n; j++) {
                if ((currAnd & nums[j]) == 0) {
                    currAnd |= nums[j]; 
                    length++;
                    maxLength = Math.max(maxLength, length);
                } else {
                    break;  
                }
            }
        }
        
        return maxLength;
    }

}