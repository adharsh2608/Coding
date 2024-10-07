class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");

        if (words1.length > words2.length) {
            String[] temp = words1;
            words1 = words2;
            words2 = temp;
        }

        int i = 0, j = 0, len1 = words1.length, len2 = words2.length;

        while (i < len1 && words1[i].equals(words2[i])) {
            i++;
        }

        while (j < len1 && words1[len1 - 1 - j].equals(words2[len2 - 1 - j])) {
            j++;
        }

        return i + j >= len1;
        
    }
}