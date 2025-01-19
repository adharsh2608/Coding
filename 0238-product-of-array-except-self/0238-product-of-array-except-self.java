class Solution {
    public int[] productExceptSelf(int[] nums){
        int product=1;
        int[] ans= new int[nums.length];
        int zerocount=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zerocount++;
            }
            else if(zerocount>=2)
            {
                product=0;
                break;
            }
            else
                product=product*nums[i];
            
        }
        if(zerocount>=2)
        {
            for(int i=0;i<nums.length;i++)
            {
                ans[i]=0;
            }
            return ans;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                ans[i]=product;
            }
            else{
                if(zerocount==1)
                {
                    ans[i]=0;
                }
                else
                {
                    ans[i]=product/nums[i];
                }
            }
        }
        return ans;
    }
}