class Solution {
    public String clearDigits(String a) {
        Stack<Character> preans=new Stack<Character>();
        for(int i=0;i<a.length();i++)
        {
            preans.push(a.charAt(i));
            if(Character.isDigit(a.charAt(i)))
            {
                preans.pop();
                preans.pop();
            }
        }
        String stStr = preans.stream().map(s -> s.toString()).collect(Collectors.joining(""));

        return stStr;
    }
}