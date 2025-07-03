class Solution {
    public char kthCharacter(int k) {
         StringBuilder s=new StringBuilder("a");
         while(s.length()<=k)
         {
            s.append(generator(s.toString()));
         }
         System.out.println(s);
    return s.charAt(k-1);
    }
    public String generator(String a)
    {
        char[] ch=a.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            int temp=(int)ch[i]+1;
            ch[i]=(char)temp;
        }
        String str =new String(ch);
        return str;
    }
}