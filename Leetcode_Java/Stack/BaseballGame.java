package Leetcode_Java.Stack;

public class BaseballGame {
    class Solution {
        public int calPoints(String[] operations) {
            Stack<Integer> stack = new Stack<>();

            for (String o : operations) {
                // ["5","2","C","D","+"] if pointer point to "+" and current stack is "5 , 10"
                // 5 + 10 = 15 , so the stack will be "5 , 10 , 15"
                if (o.equals("+")) {
                    int top = stack.pop();
                    int newTop = top + stack.peek();
                    stack.push(top);
                    stack.push(newTop);
                    // Since c is to remove , if the current stack is "5 , 2"
                    // so remove the 2 and stack become "5"
                } else if (o.equals("C")) {
                    stack.pop();
                    // D mean double , if the current stack is "5"
                    // 2 * 5 = 10 so it become "5 , 10"
                } else if (o.equals("D")) {
                    stack.push(2 * stack.peek());
                } else {
                    stack.push(Integer.valueOf(o));
                }
            }
            int result = 0;
            for (int n : stack) {
                result += n;
            }

            return result;
        }
    }
}
