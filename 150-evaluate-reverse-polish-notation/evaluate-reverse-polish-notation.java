class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        int[] stack = new int[n];
        int top = -1;
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack[top - 1] += stack[top];
                    top--;
                    break;
                case "-":
                    stack[top - 1] -= stack[top];
                    top--;
                    break;
                case "*":
                    stack[top - 1] *= stack[top];
                    top--;
                    break;
                case "/":
                    stack[top - 1] /= stack[top];
                    top--;
                    break;
                default:
                    stack[++top] = Integer.parseInt(token);
            }
        }
        return stack[top];
    }
}
