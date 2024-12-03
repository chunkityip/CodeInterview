package Leetcode_Java.Stack;

import java.util.Stack;

public class MakeTheStringGreat {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && isBadString(stack.peek() , c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }

    private boolean isBadString(Character c1 , Character c2) {
        return Character.toLowerCase(c1) == Character.toLowerCase(c2) && c1 != c2;
    }
}
