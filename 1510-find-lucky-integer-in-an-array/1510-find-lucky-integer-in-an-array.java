class Solution {
    public int findLucky(int[] arr) {
        var map=new HashMap<Integer,Integer>();
        for(int i:arr)
        {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int freq=-1;
        for(int keys:map.keySet())
        {
            if(keys==map.get(keys) && freq<keys)
            {
                freq=keys;
            }
                
        }
        return freq;
    }
}