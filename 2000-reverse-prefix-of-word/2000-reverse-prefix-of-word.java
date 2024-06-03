class Solution {
    public String reversePrefix(String word, char ch) {
        boolean flag=false;
        int i=0;
        String ination="";
        StringBuilder concat=new StringBuilder();
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                ination=word.substring(i+1,word.length());
                flag=true;
                break;
            }
        }
        if(flag)
        {
            
        for(int j=i;j>=0;j--)
        {
            concat=concat.append(word.charAt(j));
        }
            return concat+ination;
        }
        return word;
        
        
    }
}