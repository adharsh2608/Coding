class Solution {
    public String convert(String a, int rows) {
       
        boolean flag=true;
        int i=0;
        String[] arr=new String[rows];
        for(int k=0;k<rows;k++)
        {
            arr[k]="";
        }
        if(rows==1)
            return a;
        int j=0;
        while(i<a.length())
        {
            if(flag)
            {
                arr[j]=arr[j]+a.charAt(i);
                j++; i++;
                if(j==rows-1)
                {
                    flag=false;
                }
            }
            if(!flag&&i<a.length())
            {
                arr[j]=arr[j]+a.charAt(i);
                
                j--;i++;
                if(j==0)
                {
                    flag=true;
                }
            }
            
        }
        String ans="";
        for(String k:arr)
        {
            ans=ans+k;
        }
    return ans;
    }
        
    
}