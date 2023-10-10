package Leetcode.String;

public class RemoveOutermostParentheses {

    public static void main (String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));  //output:()()()
    }

    public static String removeOuterParentheses(String s) {
        //Base case
        if (s.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' ) {
                if (count > 0) {
                    sb.append(c);
                }
                count++;
            } else if (c == ')') {
                count--;
                if (count > 0) {
                    sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
