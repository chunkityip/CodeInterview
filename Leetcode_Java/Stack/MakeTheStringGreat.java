package Leetcode_Java.Stack;

public class MakeTheStringGreat {

    // Solution 1: without ASCII
    class Solution {
        public String makeGood(String s) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (!stack.isEmpty() && isBadString(stack.peek(), c)) {
                    //remove the character if isBadString() is true
                    stack.pop();
                    // if they are same case , add it to Stack
                } else {
                    stack.push(c);
                }
            }

            for (char c : stack) {
                sb.append(c);
            }

            return sb.toString();
        }

        // A Helper method to check if the two characters are the same but not the same cases
        // return True if they are not the same cases
        // return False if they are same cases
        private static boolean isBadString(char c1, char c2) {
            return Character.toLowerCase(c1) == Character.toLowerCase(c2) &&
                    c1 != c2;
        }
    }

    // Solution 2: ASCII
    class Solution {
        public String makeGood(String s) {
            Stack<Character> stack = new Stack<>();
            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                // ASCII , lowercase of 'a' is 97 and 'A' is 65
                // 97 - 65 = 32
                if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                    //remove the character if isBadString() is true
                    stack.pop();
                    // if they are same case , add it to Stack
                } else {
                    stack.push(c);
                }
            }

            for (char c : stack) {
                sb.append(c);
            }

            return sb.toString();
        }


    }
}
