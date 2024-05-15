class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> arr1=new ArrayList<Integer>();
        for(int i=1;i<nums.length;i=i+2)
        {
            arr1.add(nums[i]);
            arr1.add(nums[i-1]);
        }
        int arr[]=new int[nums.length];
        int j=0;
        for(int i:arr1)
        {
            arr[j]=i;
            j++;
        }
        return arr;
    }
}