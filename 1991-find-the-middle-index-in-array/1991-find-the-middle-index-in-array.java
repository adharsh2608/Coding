class Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int middle = -1;
        
        for (int i = 0; i < len; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            
            for (int j = 0; j < i; j++) {
                sumLeft += nums[j];
            }
            
            for (int k = i + 1; k < len; k++) {
                sumRight += nums[k];
            }
            
            if (sumLeft == sumRight) {
                middle = i;
                break; 
            }
        }
        
        return middle;
    }
}
