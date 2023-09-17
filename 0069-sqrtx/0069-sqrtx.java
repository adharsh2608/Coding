class Solution {
    public int mySqrt(int x) 
    {
     if (x < 0 && x > Integer.MAX_VALUE) 
     {
         System.exit(0);
     }
     if(x<1)
     {
         return 0;
     }
     if(x<4 &&x>=1)
     {
         return 1;
     }
     
     
     for(int i=1;i<x;i++)
     {
         if(Math.pow(i,2)>x)
         {
             return i-1;
            
         }

     }
    return 0;
     
    }
}