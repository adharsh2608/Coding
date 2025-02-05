class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int fcount = 0;
            int bcount = 0;
            int pos = i + 1;
            while (pos < n) {
                if (boxes.charAt(pos) == '1') {
                    fcount += pos - i;
                }
                pos++;
            }
            
            pos = i - 1;
            while (pos >= 0) {
                if (boxes.charAt(pos) == '1') {
                    bcount += i - pos;
                }
                pos--;
            }   
            result[i] = fcount + bcount;
        }
        return result;
    }
}