// import java.util.Stack;
// class Solution {
//     public String removeStars(String s) {
//         Stack <Character> stack = new Stack <>();
//         for(int i = 0;i< s.length();i++){
//             char ch = s.charAt(i);
//             if(ch == '*'){
//                 if (!stack.isEmpty()) {
//                     stack.pop();
//                 }
//             }
//             else{
//                 stack.push(ch);
//             }
//         }
//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < stack.size(); i++) {
//             result.append(stack.get(i));
//         }
//         return result.toString();
//     }
// }





class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '*') {
                sb.setLength(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
