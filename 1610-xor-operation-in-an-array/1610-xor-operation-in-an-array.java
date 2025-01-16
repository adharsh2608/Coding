class Solution {
    public int xorOperation(int n, int start) {
        int nums[] =new int[n];
        nums[0]=start;
        int bitwi=nums[0];
        for(int i=1;i<n;i++)
        {
            nums[i]=start+(2*i);
            bitwi^=nums[i];
        }
        return bitwi;
    }
}