class Solution {
    public int countSubarrays(int[] nums) {
      if(nums.length<3)
        return 0;
    int count=0;
      for(int i=0;i<=nums.length-3;i++)
      {
        if((double)nums[i]+nums[i+2]==((double)nums[i+1]/2))
        {
            count++;
        }

      }
      return count;
    }
}