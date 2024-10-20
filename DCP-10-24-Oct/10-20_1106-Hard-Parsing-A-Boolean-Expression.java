class Solution {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : expression.toCharArray()) {
            if (ch != ')') {
                stack.push(ch);
            } else {
                List<Character> subExpr = new ArrayList<>();
                while (stack.peek() != '(') {
                    subExpr.add(stack.pop());
                }
                stack.pop();
                
                char operator = stack.pop();
                
                boolean result = evaluate(subExpr, operator);
                
                stack.push(result ? 't' : 'f');
            }
        }
        
        return stack.pop() == 't';
    }
    
    private boolean evaluate(List<Character> subExpr, char operator) {
        if (operator == '!') {
            return subExpr.get(0) == 'f';
        } else if (operator == '&') {
            for (char ch : subExpr) {
                if (ch == 'f') {
                    return false;
                }
            }
            return true;
        } else if (operator == '|') {
            for (char ch : subExpr) {
                if (ch == 't') {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}