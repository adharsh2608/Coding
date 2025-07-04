class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long[] lengths = new long[n+1];
        lengths[0] = 1;
        for (int i = 1; i <= n; i++) {
            lengths[i] = lengths[i-1] * 2;
            if (lengths[i] > k) {
                lengths[i] = k + 1;
            }
        }
        return findChar(k, n, operations, lengths);
    }

    private char findChar(long k, int i, int[] ops, long[] lengths) {
        if (i == 0) {
            return 'a';
        }
        if (k <= lengths[i-1]) {
            return findChar(k, i-1, ops, lengths);
        } else {
            char c = findChar(k - lengths[i-1], i-1, ops, lengths);
            int shift = ops[i-1] % 26;
            return (char) ('a' + ( (c - 'a') + shift ) % 26);
        }
    }
}
