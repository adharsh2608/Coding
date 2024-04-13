class Solution {
    static String[] digitToLetters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.length() == 0)
            return combinations;
        generateCombinations(digits, 0, "", combinations);
        return combinations;
    }
    
    private static void generateCombinations(String digits, int index, String current, List<String> combinations) {
        if (index == digits.length()) {
            combinations.add(current);
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = digitToLetters[digit - '0'];
        for (int i = 0; i < letters.length(); i++) {
            generateCombinations(digits, index + 1, current + letters.charAt(i), combinations);
        }
    }
    }
