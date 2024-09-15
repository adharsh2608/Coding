class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1+=nums[i];
            sum2+=digitsum(nums[i]);
        }
        return Math.abs(sum1-sum2);
    }
    static int digitsum(int a)
    {
        int sum=0;
        while(a!=0)
        {
            sum+=a%10;
            a=a/10;
        }
        return sum;
    }
}