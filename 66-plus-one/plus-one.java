class Solution {
    public int[] plusOne(int[] digits) {
        int l=digits.length;
        int a=l;
        int carry=0;
        int sum=0;
        while(a!=0)
        {
            if(carry==1)
            {
                sum=digits[a-1]+carry;

            }
            sum=digits[a-1]+1;
            if(sum==10)
            {   
                carry=1;
                digits[a-1]=0;
            }
            else
            {   
                carry=0;
                digits[a-1]+=1;
                break;
            }
            a--;
        }
        if(digits[0]==10|| carry==1)
        {

            int[] b=new int[l+1];
            b[0]=1;
            b[1]=0;
            for(int i=1;i<l;i++)
            {
                b[i+1]=digits[i];
            }
            return b;
        }
        else
        {
            return digits;
        }
    }
}
