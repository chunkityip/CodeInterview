package Leetcode.Array;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        /*
        stack:
        2
        4
        3
        1

        stack is empty , add 1 into stack
        while nums2[i] as 3 > 1 as stack.peek() , 1 as key and 3 as value , pop 1 and push 3 at stack
        stack.pop() is 3 now
        while nums2[i] as 4  > 3 as stack.peek() , 3 as key and 4 as value , pop 3 and push 4 at stack
        stack.pop() is 4 now
        while nums2[i] as 2  > 4 as stack.peek() ? no , irgrone mapping , irgrone pop but stil 2 at stack
        iterional is finished
        In HashMap:
        1 3
        3 4

        In Stack:
        2
        4

        while stack is not empty , we put left number as key and -1 as value and pop all of it from stack
        In HashMap:
        1 3
        3 4
        2 -1
        4 -1

        iterat thu nums[i] , getting the value of nums[i]
        nums1 = [4,1,2]
        so , return -1 , 3 , -1
        */

        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty() && nums2[i] > stack.peek()) {
                map.put(stack.pop() , nums2[i]);
            }
            stack.push(nums2[i]);
        }

        while (!stack.isEmpty()) {
            map.put(stack.pop() , -1);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}
