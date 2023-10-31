class Solution {
    boolean flag=false;
    public boolean isHappy(int n) {
        ArrayList<Integer> sums=new ArrayList<>();
        checkTrue(n,sums);
        return flag;

    }
    public void checkTrue(int n,ArrayList<Integer> sums)
    {
        if(n==1)
        {
            flag=true;
            return;
        }
        else if(sums.contains(n))
        {
            flag=false;
            return;

        }
        else
        {
            sums.add(n);
        }
        int temp=n;
        int digit=0;
        int sum=0;
        while(temp!=0)
        {
            digit=temp%10;
            sum+=digit*digit;
            temp=temp/10;
        }
        n=sum;
        checkTrue(n,sums);
    }
}