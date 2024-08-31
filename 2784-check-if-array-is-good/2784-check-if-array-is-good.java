class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        int max=nums[nums.length-1];
        if(max+1!=nums.length)
        {return false;
        }
        int i=0;
        for( i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=i+1)
            {
                return false;
            }
            
        }
        if(nums[nums.length-1]!=i)
        {
            return false;
        }
        return true;
    }
}