// class Solution {
//     public boolean isValid(String s) {
//         char[] stack = new char[s.length()];
//         int top = -1;
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 stack[++top] = ch;
//             } 
//             else {
//                 if (top == -1) return false;
//                 char open = stack[top--];
//                 if ((ch == ')' && open != '(') ||
//                     (ch == '}' && open != '{') ||
//                     (ch == ']' && open != '[')) {
//                     return false;
//                 }
//             }
//         }
//         return top == -1;
//     }
// }






import java.util.HashMap;

class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        char[] stack = new char[s.length()];
        int top = -1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack[++top] = ch;
            } else {
                if (top == -1 || stack[top--] != map.get(ch)) {
                    return false;
                }
            }
        }

        return top == -1;
    }
}
