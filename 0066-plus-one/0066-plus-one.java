class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int sum=0;
        int j=0;
        if(digits[digits.length-1]<9)
        {
            digits[digits.length-1]+=1;
        }
        else if(digits.length==1)
        {
            int[] arra={1,0};
            return arra;
        }
        else
        {
            
            int[] arra=new int[digits.length+1];
            digits[digits.length-1]=10;
        
        for(int i=digits.length-1;i>0;i--)
        {
            if(digits[i]==10)
            {
                digits[i-1]=digits[i-1]+1;
                digits[i]=0;
            }
        }
        if(digits[0]==10)
        {
            arra[0]=1;
            for(int i=1;i<arra.length-1;i++)
            {
                arra[i]=digits[i];
            }
            return arra;
        }
       
    }
        return digits;
    }
}
