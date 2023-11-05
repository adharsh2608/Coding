class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1]; // Memoization array
        return Recursion(0, n, memo);
    }

    public int Recursion(int pos, int n, int[] memo) {
        if (pos == n) {
            return 1;
        } else if (pos > n) {
            return 0;
        } else if (memo[pos] > 0) {
            return memo[pos];
        } else {
            int ways = Recursion(pos + 1, n, memo) + Recursion(pos + 2, n, memo);
            memo[pos] = ways;
            return ways;
        }
    }
}
