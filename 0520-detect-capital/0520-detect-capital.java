class Solution {
    public boolean detectCapitalUse(String word) {
        boolean fd=false;
        if(Character.isUpperCase((word.charAt(0))))
        {
            fd=true;
        }
        int count=0;
       if(fd)
       {
           for(int i=1;i<word.length();i++)
           {
               if(!Character.isUpperCase((word.charAt(i))))
               {
                   count--;
               }
               else
               {
                   count++;
               }
           }
           if(Math.abs(count)==word.length()-1)
           {
               return true;
           }
           else
           {
               return false;
           }
       }
       else
       {
           for(int i=1;i<word.length();i++)
           {
               if(Character.isUpperCase((word.charAt(i))))
               {
                   return false;
               }
           }
       }
        return true;
    }
}