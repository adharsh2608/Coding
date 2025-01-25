class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> a= new ArrayList<Integer>();
        int number=n;
        int sum=0;
        boolean flag=false;
        while(flag==false)
        {   
            while(number!=0)
            {
                int b=number%10;
                sum+=b*b;
                number=number/10;
            }
            number=sum;
            if(sum==1)
            {
                return true;
            }
            
            if(a.contains(sum))
            {
                flag=true;
                return false;
            }
            a.add(sum);
            sum=0;
        }
        return false;
    }

}
