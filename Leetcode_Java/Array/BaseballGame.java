package Leetcode_Java.Array;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (!"C".equals(operations[i]) && !"D".equals(operations[i]) && !"+".equals(operations[i])) {
                int value = Integer.valueOf(operations[i]);
                stack.push(value);
                sum += value;
            } else if (!stack.isEmpty() && "C".equals(operations[i])) {
                sum -= stack.pop();
            } else if (!stack.isEmpty() && "D".equals(operations[i])) {
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            } else if (!stack.isEmpty() && "+".equals(operations[i])) {
                //Second biggest : For example : 5 ,10. top will be 10
                int top = stack.pop();
                //Thired biggest which it sum it : For example : top is 10 and stack.peek is 5. 5 + 10 = 15
                int newTop = top + stack.peek();
                //We store Second bigger to second postition
                stack.push(top);
                //We store third bigger so they are in right order
                stack.push(newTop);

                sum += newTop;
            }
        }

        return sum;
    }
}
