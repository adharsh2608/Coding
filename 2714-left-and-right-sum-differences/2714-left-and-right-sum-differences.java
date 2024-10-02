class Solution {
    public int[] leftRightDifference(int[] nums) {
    int[] ans=new int[nums.length];
    
        if(nums.length==1)
        {
            ans[0]=0;
            return ans;
        }
        int[] left=new int[nums.length];
        int[] right =new int[nums.length];
        int j=nums.length-2;
        left[0]=0;
        right[j+1]=0;
        for(int i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]+nums[i-1];
            right[j]=right[j+1]+nums[j+1];
            j--;
        }
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=Math.abs(left[i]-right[i]);

        }
        return ans;
    }
    
}