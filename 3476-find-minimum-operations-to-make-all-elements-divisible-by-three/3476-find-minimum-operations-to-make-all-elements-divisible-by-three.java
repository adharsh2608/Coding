class Solution {
    public int minimumOperations(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3==0)
            {
                count+=0;
            }
            else
            {
                count+=1;
            }
        }
        return count;
    }
}