package Leetcode_Java.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public boolean isPalindrome(ListNode head) {
        //Create a array and put ListNode into array
        List<Integer> list = new ArrayList<>();
        ListNode dummy = head;

            while (dummy != null) {
            list.add(dummy.val);
            dummy = dummy.next;
        }

        int left = 0 , right = list.size() - 1;

            while (left < right) {
            if (!list.get(left).equals(list.get(right))) return false;

            left++;
            right--;
        }

            return true;
        }
}
