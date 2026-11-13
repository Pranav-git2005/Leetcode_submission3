class Solution {
    public int calPoints(String[] operations) {
        int[] stack = new int[operations.length];
        int top = -1;

        for (String op : operations) {
            switch (op) {
                case "+":
                    stack[top + 1] = stack[top] + stack[top - 1];
                    top++;
                    break;

                case "D":
                    stack[top + 1] = 2 * stack[top];
                    top++;
                    break;

                case "C":
                    top--;
                    break;

                default:
                    stack[++top] = Integer.parseInt(op);
            }
        }

        int sum = 0;

        for (int i = 0; i <= top; i++) {
            sum += stack[i];
        }

        return sum;
    }
}
