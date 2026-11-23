import java.util.*;

class Solution {
    public int calculate(String s) {
        Deque<Integer> stack = new ArrayDeque<>();

        int result = 0;
        int sign = 1;
        stack.push(1);

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                int num = 0;

                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }

                i--;
                result += sign * num;
            }
            else if (ch == '+') {
                sign = stack.peek();
            }
            else if (ch == '-') {
                sign = -stack.peek();
            }
            else if (ch == '(') {
                stack.push(sign);
            }
            else if (ch == ')') {
                stack.pop();
            }
        }

        return result;
    }
}
