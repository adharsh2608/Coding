class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
        {
            return true;
        }
        int temp=num;
        int digits=0;
        while(temp!=0)
        {
            temp=temp/10;
            digits++;
        }
        System.out.println(digits);
        for(int i=0;i<=num/digits;i++)
        {
            if(i*i==num)
            {
                return true;
            }
        }
        return false;
    }
}