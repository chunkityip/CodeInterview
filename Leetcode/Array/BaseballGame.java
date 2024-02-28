package Leetcode.Array;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")) {
                int value = Integer.valueOf(operations[i]);
                stack.push(value);
                sum += value;
            } else if (!stack.isEmpty() && operations[i].equals("C")) {
                sum -= stack.pop();
            } else if (!stack.isEmpty() && operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
                sum += stack.peek();
            } else if (!stack.isEmpty() && operations[i].equals("+")) {
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
