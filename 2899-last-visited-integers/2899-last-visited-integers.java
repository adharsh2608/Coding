class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> arr= new ArrayList<Integer>();
        List<Integer> ans=new ArrayList<Integer>();
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=0)
            {
                k=0;
                arr.add(nums[i]);
            }
            else if(nums[i]==-1)
            {
                k++;
                if(k<=arr.size())
                {
                    ArrayList<Integer> rev_arr = new ArrayList<>(arr);
                    Collections.reverse(rev_arr);
                    ans.add(rev_arr.get(k-1));
                    
                }
                else
                {
                    ans.add(-1);
                }
            }
        }
        return ans;
    }
}