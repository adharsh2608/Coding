import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> word = new HashMap<>();
        HashMap<Character, Character> ans = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if (word.containsKey(sc)) {
                if (word.get(sc) != tc) {
                    return false;
                }
            } else {
                word.put(sc, tc);
            }

            if (ans.containsKey(tc)) {
                if (ans.get(tc) != sc) {
                    return false;
                }
            } else {
                ans.put(tc, sc);
            }
        }

        return true;
    }
}
