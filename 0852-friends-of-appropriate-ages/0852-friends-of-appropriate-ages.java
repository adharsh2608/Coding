import java.util.Arrays;

class Solution {
    public int numFriendRequests(int[] ages) {
        Arrays.sort(ages);
        int count = 0;
        int n = ages.length;
        int left = 0, right = 0;

        for (int i = 0; i < n; i++) {
            int age = ages[i];
            if (age < 15) continue;

            while (left < n && ages[left] <= 0.5 * age + 7) {
                left++;
            }

            while (right + 1 < n && ages[right + 1] <= age) {
                right++;
            }

            count += Math.max(0, right - left);
        }

        return count;
    }
}
