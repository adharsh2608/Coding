class Solution {
    public String toGoatLatin(String sentence) {
     String result[]=sentence.split(" ");
     String ans="";
     for(int i=0;i<result.length;i++)
     {
        if(checkVowel(result[i]))
            {
                result[i]=result[i]+"ma"+"a".repeat(i+1);
            }
        else
            {
                result[i]=result[i].substring(1,result[i].length())+""+result[i].charAt(0)+"ma"+"a".repeat(i+1);
            }
     } 
     for(String j:result)
     {
        ans+=j+" ";
     }
     ans=ans.substring(0,ans.length()-1);
     return ans;
        
    }
    public boolean checkVowel(String a)
    {
        a=a.toLowerCase();
        char c=a.charAt(0);
        
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
        else
            return false;
    }
}