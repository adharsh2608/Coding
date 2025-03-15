class Solution {
    public int maximumCandies(int[] candies, long k) {
        long total = 0;
        for (int c : candies) total += c;
        if (total < k) return 0;

        int left = 1, right = Arrays.stream(candies).max().getAsInt();
        int result = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canDistribute(candies, k, mid)) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    private boolean canDistribute(int[] candies, long k, int mid) {
        long count = 0;
        for (int c : candies) {
            count += c / mid;
        }
        return count >= k;
    }
}
