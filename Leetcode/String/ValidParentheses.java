package Leetcode.String;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        //Base code
        if (s.isEmpty()) return false;

        //We should use Stack. Since Stack is LIFO , whever we add in the last , it will remove first

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            /*
            Step one:
            1. We are checking is any following character ( , { and [ in the char c
            2. If yes , push to stack
            */
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            /* Step two:
            1. We are checking is any following character ) , { and ] in the char c
            Since we are looking for balance(valid) , stack should have ( , { and [ since they are the a front
            2. If stack is empty but only have ) , { and ] in c , it isn't balance(valid).
            3. If stack isn't empty , we can create a char call balance to add stack.pop();
            */
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false;
                char balance = stack.pop();
            /* Step three:
            1. We are checking is c a open bracket and balance is closing bracket
            2. Since we many have the situation : "((])){" , we have to make use c is a open bracket and balance is a closing bracket
            */
                if (c == ')' && balance != '(' ||
                        c == '}' && balance != '{' ||
                        c == ']' && balance != '[' ) {
                    return false;
                }
            }
        }

        //If the stack is empty , it means it match all the case as valid parentheses
        //so return true if the stack is empty

        return stack.isEmpty();
    }

    public static void main (String[] args) {
        System.out.println(isValid("()"));        // true
        System.out.println(isValid("()[]{}"));    // true
        System.out.println(isValid("(())"));      // true
        System.out.println(isValid("{[]}"));      // true
        System.out.println(isValid("(]"));        // false
        System.out.println(isValid("([)]"));      // false
    }
}
