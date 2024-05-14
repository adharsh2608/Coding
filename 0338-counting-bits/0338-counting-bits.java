class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
         for(int i=1;i<=n;i++)
         {
             int temp=i;
             int count=0;
             while(temp>0)
             {
                 if(temp%2==1)
                 {
                     count++;
                 }
                 temp=temp/2;
             }
             arr[i]=count;
                 
         }
        return arr;
    }
}
