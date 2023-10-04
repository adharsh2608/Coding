class Solution {
    public boolean isPalindrome(int x) {
        String a=Integer.toString(x);
        char[] ab=a.toCharArray();
        String b="";
        for(int i=a.length()-1;i>=0;i--)
        {
            b=b+ab[i];
        }
        if(a.equals(b))
            return true;
        else
            return false;
        
    }
}