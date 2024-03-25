class Solution {
    public void reverseString(char[] s) {
        int start=0;
        int stop=s.length-1;
        while(start<=stop)
        {
            char temp=s[start];
            s[start]=s[stop];
            s[stop]=temp;
            start++;
            stop--;
        }

    }
}