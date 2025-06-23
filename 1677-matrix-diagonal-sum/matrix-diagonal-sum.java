class Solution {
    public int diagonalSum(int[][] mat) {
        int len=mat.length;
        int sum=0;
        int bsum=0;
            for(int k=0;k<len;k++)
            {
                sum+=mat[k][k]+mat[k][len-k-1];
                
            }           
        if(len%2!=0)
        {sum-=mat[(len/2)][(len/2)];}
        return sum+bsum;
    }
}