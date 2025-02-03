class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int count=1;
        int tempmax=1;
        int tempmax2=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>nums[i-1])
            {
                count+=1;
            }
            else
            {
                if(count>tempmax)
                    tempmax=count;
                count=1;
            }
        }
        if (count > tempmax) {
            tempmax = count;
        }
        count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1])
            {
                count+=1;
            }
            else
            {
                if(count>tempmax2)
                    tempmax2=count;
                count=1;
        }
        }
        if (count > tempmax2) {
            tempmax2 = count;
        }
        if(tempmax>tempmax2)
            return tempmax;
        return tempmax2;
    
}
}