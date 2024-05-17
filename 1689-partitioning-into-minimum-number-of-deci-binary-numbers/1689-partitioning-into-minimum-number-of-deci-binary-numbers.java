class Solution {
    public int minPartitions(String n) {
        
        int maxsize=0;
        for(int i=0;i<n.length();i++)
        {
            int temp=Character.getNumericValue(n.charAt(i));
            if(temp>maxsize)
            {
                maxsize=temp;
            }
        }
        return maxsize;
    }
}