package Leetcode_Java.String;

import java.util.Stack;

public class MinimumInsertionsToBalanceAParenthesesString {

    //This question is highly asked in JPMorgan
    public int minInsertions(String s) {
        //For one ( , add 2 as ))
        //For two ) , add 1 as (
        //Create a integer call ans to store the Minimum Insertions , create a Stack to store the s.charAt()

        //If there have one ( , we push into stack , and we can add 2 x stack.size() into ans
        //else , it means there have ) , we need to check is the next index also )
        //if yes , we can skip the i loop to next i index (We have )) , we are checking is right parentheses done or not , if next index isn't ) , the right parentheses is  done)
        //if no , which mean the right parentheses is  done , ans + 1 since For two ) , add 1 as (
        //if stack is not empty , it means we have ) left over , just remove it
        //else , ans + 1

        //Now the stack should only have ( left over , add 2 x stack.size() into ans
        int ans = 0;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    // Skip the next character, as it is a closing parenthesis.
                    i++;
                } else {
                    // If the next character is not a closing parenthesis, it means there's a missing closing parenthesis.
                    ans++;
                }

                if (!stack.isEmpty()) {
                    // If there's an opening parenthesis on the stack, pop it.
                    stack.pop();
                } else {
                    // If there's no opening parenthesis on the stack, it means there's a missing opening parenthesis.
                    ans++;
                }
            }
        }

        // After processing the string, add the remaining opening parentheses on the stack to the answer.
        ans += 2 * stack.size();

        return ans;
    }
}
