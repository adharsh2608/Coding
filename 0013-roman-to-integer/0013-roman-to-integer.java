class Solution {
    public int romanToInt(String s) {
        char[] ch = s.toCharArray();
        int size=ch.length;
        int[] arr=new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
            if(ch[i]=='I')
            {
                arr[i]=1;
            }
            else if(ch[i]=='V')
            {
                arr[i]=5;
            }
            else if(ch[i]=='X')
            {
                arr[i]=10;
            }
            else if(ch[i]=='L')
            {
                arr[i]=50;
            }
            else if(ch[i]=='C')
            {
                arr[i]=100;
            }
            else if(ch[i]=='D')
            {
                arr[i]=500;
            }
            else if(ch[i]=='M')
            {
                arr[i]=1000;
            }
        }
        
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                sum=sum+arr[i];
            }
            else if(arr[i]<arr[i+1])
            {
                sum=sum-arr[i];
            }
        
        }
        sum=sum+arr[size-1];
        return sum;
   

    }
}