class Solution {
     public String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder num = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i <= n; i++) {
            stack.push(i + 1);
            
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    num.append(stack.pop());
                }
            }
        }
        
        return num.toString();
    }

}