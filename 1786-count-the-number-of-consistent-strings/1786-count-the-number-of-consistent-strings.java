class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] allowede = allowed.toCharArray();
        int ans = 0;
        
        
        for (int i = 0; i < words.length; i++) {
            boolean flag = true;

            
            for (int j = 0; j < words[i].length(); j++) {
                boolean found = false;

                
                for (int k = 0; k < allowede.length; k++) {
                    if (words[i].charAt(j) == allowede[k]) {
                        found = true;
                        break;
                    }
                }

                
                if (!found) {
                    flag = false;
                    break;
                }
            }

            
            if (flag) {
                ans++;
            }
        }

        return ans;
    }
}
