class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset=new ArrayList<Integer>();
        List<List<Integer>> ans=new ArrayList<>(); 
        recursion(nums, 0, subset,ans);  
        return ans;
    }
    public void recursion(int nums[],int i,List<Integer> subset, List<List<Integer>> ans)
    {
        if(i>=nums.length)
        {
            ans.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[i]);
        recursion(nums,i+1,subset,ans);
        subset.remove(subset.size()-1);
        recursion(nums,i+1,subset,ans);
    }
}
