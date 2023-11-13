package Leetcode.LinkedList;

import java.util.HashSet;

public class LinkedListCycle2 {
    //This time , we are checking where is the cycle node start compare to return true or false(LinkedListCycle)

    //First solution
    //Again , we use Hashtable to check where is the cycle node start
    public LinkedListCycle.ListNode detectCycle(LinkedListCycle.ListNode head) {
        if (head == null || head.next == null) return null;

        HashSet<LinkedListCycle.ListNode> set = new HashSet<>();

        while (head != null && head.next != null) {
            if (set.contains(head)) return head;

            set.add(head);
            head = head.next;
        }
        return null;
    }

    //Second solution
    //Using two pointer
    //This time , we need to check tow cycle
    //First cycle is to check is the LinkedList cycle or not. Once we found it , set one pointer to head again
    //Second cycle is to check where is the cycle node start. Once we found it , return it

    public LinkedListCycle.ListNode detectCycle2(LinkedListCycle.ListNode head) {
        if (head == null || head.next == null) return null;

        LinkedListCycle.ListNode slow = head;
        LinkedListCycle.ListNode fast = head;

        while (fast != null && fast.next != null) {
            //First cycle match
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                //We set slow to head so we can point out slow is the head of cycle begins
                slow = head;
                //Second cycle match
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
