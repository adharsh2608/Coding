import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
            return nums[0];
        Arrays.sort(nums);
        int max_count=1;
        int cur_count=1;
        int element=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            
            if(max_count<=cur_count)
            {
                max_count=cur_count;
                element= nums[i];
            }
            
            if(nums[i+1]!=nums[i])
            {
             cur_count=1; 
            }
            else
                cur_count++;
            
        }
        return element;
    }
}