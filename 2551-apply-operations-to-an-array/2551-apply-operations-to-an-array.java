class Solution {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) 
        {
            if (nums[i] == nums[i + 1]) 
            {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int sarr = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != 0) 
            {
                nums[sarr++] = nums[i];
            }
        }
        while (sarr < nums.length) {
            nums[sarr++] = 0;
        }
        return nums;
    }
}