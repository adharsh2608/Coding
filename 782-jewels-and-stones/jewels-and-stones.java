class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> jew=new HashSet<Character>();
        for(int i=0;i<jewels.length();i++)
        {
            jew.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++)
        {
            if(jew.contains(stones.charAt(i)))
                count++;
        }
        return count;
        }
}