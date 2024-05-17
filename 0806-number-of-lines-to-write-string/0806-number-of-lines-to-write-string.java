class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int result[]=new int[2];
        int sum=0;
        int line=1;
        
        for(int i=0;i<s.length();i++)
        {
            
            sum+=widths[(s.charAt(i))-97];
            if(sum==100)
            {
                line++;
                sum=0;
            }

            else if(sum>100)
            {
                line++;
                sum=sum-widths[(s.charAt(i))-97];
                i--;
                sum=0;
            }
            else
            {}
        }
        if(sum==0)
        {
            sum=100;
            line=line-1;
        }
        result[0]=line;
        result[1]=sum;
        return result;
    }
}