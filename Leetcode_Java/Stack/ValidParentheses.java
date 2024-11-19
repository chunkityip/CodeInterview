package Leetcode_Java.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    // Solution one :
    class Solution {
        public boolean isValid(String s) {
            if (s.length() == 0) return false;

            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                if (c == '[' || c == '{' || c == '(') {
                    stack.push(c);
                } else if ((!stack.isEmpty() && stack.peek() == '(' && c == ')') ||
                        (!stack.isEmpty() && stack.peek() == '[' && c == ']') ||
                        (!stack.isEmpty() && stack.peek() == '{' && c == '}')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
        }
    }

    // Solution two
    class Solution {
        public boolean isValid(String s) {
            if (s.length() == 0) return false;

            Map<Character , Character> map = new HashMap<>();
            map.put(')' , '(');
            map.put('}', '{');
            map.put(']' , '[');

            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    stack.push(c);
                }
            }
            return stack.isEmpty();
        }
    }
}
