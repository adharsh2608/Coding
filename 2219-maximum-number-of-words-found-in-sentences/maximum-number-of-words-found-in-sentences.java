class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int j = 0; j < sentences.length; j++) {
            int count = 1; 
            for (int i = 0; i < sentences[j].length(); i++) {
                if (sentences[j].charAt(i) == ' ') {
                    count += 1; 
                }
            }
            if (count > max) {
                max = count;
            }
        }

        return max;
    }
}
