class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int sl=0;
        int count=0;
        while(sl<s.length)
        {
            if(i==g.length)
                return count;
            if(g[i]<=s[sl])
            {
                count++;
                i++;
                sl++;
            }
            else
            {
                sl++;
            }
        }
        return count;
    }
}