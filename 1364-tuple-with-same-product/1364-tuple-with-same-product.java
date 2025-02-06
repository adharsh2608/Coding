import java.util.HashMap;
import java.util.Map;

class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> productCount = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int product = nums[i] * nums[j];
                productCount.put(product, productCount.getOrDefault(product, 0) + 1);
            }
        }
        
        int total = 0;
        for (int count : productCount.values()) {
            if (count >= 2) {
                total += count * (count - 1) * 4; // Multiply by 4 to account for tuple ordering
            }
        }
        
        return total;
    }
}