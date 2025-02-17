class Solution {
    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        return dfs(freq) - 1;
    }

    private int dfs(Map<Character, Integer> freq) {
        int count = 1;
        for (char c : freq.keySet()) {
            if (freq.get(c) > 0) {
                freq.put(c, freq.get(c) - 1);
                count += dfs(freq);
                freq.put(c, freq.get(c) + 1);
            }
        }
        return count;
    }
    }

