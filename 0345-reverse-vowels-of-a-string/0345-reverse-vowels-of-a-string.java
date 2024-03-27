class Solution {
    public String reverseVowels(String b) {
        Solution s=new Solution();
        char[] a= b.toCharArray();
        int start=0;
        int end=b.length()-1;
        while(start<=end)
        {
            if(s.isVowel(a[start])==true && s.isVowel(a[end])==true)
            {
                char temp;
                temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
            else if(s.isVowel(a[start])==true && s.isVowel(a[end])==false)
            {
                end--;
            }
            else if(s.isVowel(a[start])==false && s.isVowel(a[end])==true)
            {
                start++;
            }
            else
            {
                start++;
                end--;
            }
        }
        String str= new String(a);
        return str;
    }
    public boolean isVowel(char c)
    {
        boolean flag=false;
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            flag=true;
        }
        return flag;
    }
}