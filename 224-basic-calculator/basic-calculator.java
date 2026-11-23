class Solution {
    public int calculate(String s) {
        char[] ch = s.toCharArray();
        int n = ch.length;

        int[] stack = new int[n + 1];
        int top = 0;

        int result = 0;
        int sign = 1;

        stack[0] = 1;

        for (int i = 0; i < n; i++) {
            char c = ch[i];

            if (c >= '0' && c <= '9') {
                int num = 0;

                while (i < n && ch[i] >= '0' && ch[i] <= '9') {
                    num = num * 10 + ch[i] - '0';
                    i++;
                }

                result += sign * num;
                i--;
            }
            else if (c == '+') {
                sign = stack[top];
            }
            else if (c == '-') {
                sign = -stack[top];
            }
            else if (c == '(') {
                stack[++top] = sign;
            }
            else if (c == ')') {
                top--;
            }
        }

        return result;
    }
}
