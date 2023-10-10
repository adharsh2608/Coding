import java.util.*;
class Solution {
    public String reverseWords(String s) {
        Solution sup=new Solution();
        StringTokenizer st=new StringTokenizer(s," ");
		ArrayList<String> arr=new ArrayList<String>();
        while(st.hasMoreTokens())
        {
        	arr.add(st.nextToken());
        }
        String b="";
        for(String a:arr)
        {
        	b=b+sup.revChar(a)+" ";
        }
        b=b.substring(0, b.length()-1);
        return b;
	}
	String revChar(String a)
	{
		String b="";
		int len=a.length();
		for(int i=len-1;i>=0;i--)
			b=b+a.charAt(i);
		return b;
	}
}   
