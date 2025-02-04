class Solution {
    public int maxAscendingSum(int[] nums) {
        int tempsum=nums[0];
        int maxsum=nums[0];
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                tempsum=tempsum+nums[i];
            }
            else
            {
                if(tempsum>maxsum)
                {
                    maxsum=tempsum;
                }
                tempsum=nums[i];
            }
        }
        if(tempsum>maxsum)
            return tempsum;
        return maxsum;
    }
}