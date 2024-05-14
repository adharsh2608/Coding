class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer> b=new HashMap<Integer,Integer>();
        
        for(int i=1;i<=nums.length;i++)
        {
           
            b.put(i,i);
        }
        for(int i=0;i<nums.length;i++)
        {
            if(b.containsKey(nums[i]))
            {
               b.remove(nums[i]);
            }
        }
        List<Integer> l = new ArrayList<Integer>(b.keySet());
        return l;
    }
}