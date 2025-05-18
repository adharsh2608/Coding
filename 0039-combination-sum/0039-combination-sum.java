class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        var sumo=new ArrayList<List<Integer>>();
        var temp=new ArrayList<Integer>();
        recur(sumo,temp,0,0,target,nums);
        return sumo;
    }
    public void recur(ArrayList<List<Integer>> sumo, ArrayList<Integer> temp,int i, int currsum,int target, int[] nums)
    {
        if(currsum==target)
        {
            sumo.add(new ArrayList<Integer>(temp));
            return;
        }
        if(i>=nums.length||currsum>target)
        {
            return;
        }
        
        
        temp.add(nums[i]);
        recur(sumo,temp,i,currsum+nums[i],target,nums);
        temp.remove(temp.size()-1);
        recur(sumo,temp,i+1,currsum,target,nums);

    }
}
