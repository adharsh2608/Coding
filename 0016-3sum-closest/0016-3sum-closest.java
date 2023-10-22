class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length;
        int sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    int temp=nums[i]+nums[j]+nums[k];
                    if(target==target)
                    {
                    if(Math.abs(target-temp)<Math.abs(target-sum) )
                    {
                        sum=temp;
                    }
                    }
                    else
                    {if(Math.abs(target-temp)<Math.abs(target-sum) && temp>sum)
                    {
                        sum=temp;
                    }
                    }
                    
                }
            }
        }
        return sum;
    }
}