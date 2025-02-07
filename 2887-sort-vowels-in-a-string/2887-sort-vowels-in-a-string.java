class Solution {
    public String sortVowels(String s) {
        String ans="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                count++;
            }
        }
        char[] arr=new char[count];
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(isVowel(s.charAt(i)))
            {
                arr[j]=s.charAt(i);
                j++;
            }
        }
        
        int k=0;
        Arrays.sort(arr);
        for(int i=0;i<s.length();i++)
        {
            if(!isVowel(s.charAt(i)))
            {
                ans=ans+""+s.charAt(i);
            }
            else
            {
                ans=ans+""+arr[k];
                k++;
            }
        }
        return ans;
        
    }
    public boolean isVowel(char c)
    {
        c=Character.toLowerCase(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        return false;
    }
}