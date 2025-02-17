class Solution {
    private int[] result;
    private boolean[] used;

    public int[] constructDistancedSequence(int n) {
        int size = 2 * n - 1;
        result = new int[size];
        used = new boolean[n + 1];
        backtrack(0, n);
        return result;
    }

    private boolean backtrack(int index, int n) {
        if (index == result.length) {
            return true;
        }
        if (result[index] != 0) {
            return backtrack(index + 1, n);
        }
        for (int i = n; i >= 1; i--) {
            if (used[i]) continue;
            if (i == 1) {
                result[index] = 1;
                used[i] = true;
                if (backtrack(index + 1, n)) {
                    return true;
                }
                used[i] = false;
                result[index] = 0;
            } else {
                if (index + i >= result.length || result[index + i] != 0) continue;
                result[index] = i;
                result[index + i] = i;
                used[i] = true;
                if (backtrack(index + 1, n)) {
                    return true;
                }
                used[i] = false;
                result[index] = 0;
                result[index + i] = 0;
            }
        }
        return false;
    }
}