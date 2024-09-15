class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String a:operations)
        {
            if(a.charAt(0)=='+'||a.charAt(2)=='+')
            {
                x+=1;
            }
            else
            {
                x-=1;
            }
        }
        return x;
    }
}