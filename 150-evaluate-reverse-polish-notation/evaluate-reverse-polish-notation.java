class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        int result = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (isOperand(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + tokens[i]);
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }

    public boolean isOperator(String element) {
        return element.equals("+") || element.equals("-") || 
               element.equals("*") || element.equals("/");
    }

    public boolean isOperand(String element) {
        try {
            Double.parseDouble(element);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}