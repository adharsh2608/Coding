class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        var map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(target-nums[i]))
            {
                map.put(nums[i],i);
            }
            else
            {
                ans[0]=map.get(target-nums[i]);
                map.put(nums[i],i);
                ans[1]=map.get(nums[i]);
            }
        }
        return ans;
}       
}