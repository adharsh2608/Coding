class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>9)
            {
                sum+=Encrypt(nums[i]);
            }
            else
            {
                sum+=nums[i];
            }
        }
        return sum;
        
    }
    int Encrypt(int a)
    {
        int count=1;
        int max=a%10;
        while(a!=0)
        {
            int rem=a%10;
            if(rem>max)
                max=rem;
            count++;
            a=a/10;
        }
        int num=0;
        for(int i=count-1;i>0;i--)
        {
            num+=max*Math.pow(10,i);
        }
        return num/10;
    }
}