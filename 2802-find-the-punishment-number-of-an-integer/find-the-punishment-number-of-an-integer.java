import java.util.*;

class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            if (canPartition(String.valueOf(square), i)) {
                sum += square;
            }
        }
        return sum;
    }

    private boolean canPartition(String s, int target) {
        if (s.isEmpty() && target == 0) return true;
        if (target < 0) return false;
        for (int i = 1; i <= s.length(); i++) {
            String left = s.substring(0, i);
            String right = s.substring(i);
            int num = Integer.parseInt(left);
            if (canPartition(right, target - num)) {
                return true;
            }
        }
        return false;
    }
}