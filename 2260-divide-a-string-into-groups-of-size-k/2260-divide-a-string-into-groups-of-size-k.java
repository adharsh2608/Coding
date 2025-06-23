class Solution {
    public String[] divideString(String s, int k, char fill) {
        int num=s.length()%k;
        System.out.println(num);
        int arrSize=s.length()/k;
        if(num!=0)
            arrSize+=1;
        String[] ans=new String[arrSize];
        int j=0;
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp+=s.charAt(i);
            if((i+1)%k==0)
                {
                    ans[j]=temp;
                    j++;
                    temp="";
                }
        }
        
        if(!temp.isEmpty()){
            temp+=String.valueOf(fill).repeat(k-temp.length());
            ans[j]=temp;
        }
        return ans;
    }
}

