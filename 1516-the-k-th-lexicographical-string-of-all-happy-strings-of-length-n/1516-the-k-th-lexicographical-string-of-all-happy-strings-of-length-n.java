class Solution {
    private int count = 0;
    private String result = "";

    public String getHappyString(int n, int k) {
        backtrack(n, k, new StringBuilder(), new char[]{'a', 'b', 'c'});
        return result;
    }

    private void backtrack(int n, int k, StringBuilder current, char[] chars) {
        if (current.length() == n) {
            count++;
            if (count == k) {
                result = current.toString();
            }
            return;
        }

        for (char c : chars) {
            if (current.length() == 0 || current.charAt(current.length() - 1) != c) {
                current.append(c);
                backtrack(n, k, current, chars);
                current.deleteCharAt(current.length() - 1);
            }
        }
    }
}