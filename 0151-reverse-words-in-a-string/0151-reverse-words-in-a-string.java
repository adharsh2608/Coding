import java.util.*;
class Solution {
    public String reverseWords(String s) {
        ArrayList<String> str=new ArrayList<>();    
        StringTokenizer st=new StringTokenizer(s," ");
        while(st.hasMoreTokens())
        {
            str.add(st.nextToken());
        }
        String b="";
        System.out.println(str);
        String arr[] = str.toArray(new String[str.size()]);
        
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
            b+=arr[i]+" ";
        }
        return(b.substring(0,b.length()-1));
        
    }
}