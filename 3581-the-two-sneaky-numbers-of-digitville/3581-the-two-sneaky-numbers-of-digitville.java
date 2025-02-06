class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int[] result=new int[2];
        int j=0;
        for(int i:nums)
        {
            if(arr.contains(i))
            {
                result[j]=i;
                j++;
            }
            else
            {
                arr.add(i);
            }
        }
        return result;
    }
}