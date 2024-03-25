
class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int dif=Math.abs(nums[1]-nums[0]);
        for(int i=1;i<nums.length-1;i++)
        {
            if(Math.abs(nums[i+1]-nums[i])<dif)
            {
                dif=nums[i+1]-nums[i];
            }
        }
        return Math.abs(dif);
    }
}