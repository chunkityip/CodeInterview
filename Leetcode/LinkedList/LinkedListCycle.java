package Leetcode.LinkedList;

import java.util.HashSet;

public class LinkedListCycle {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        //First solution : Using Hash Table
        //The cycle means there will have same node following the next pointer.
        //The keyword is repeating node

        //We can use Hase Set to keep storeing the node
        //If set contains the head node , return true

        HashSet<ListNode> set = new HashSet<>();

        while (head != null) {
            if(set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        //The cycle means there will have same node following the next pointer.
        //The keyword is repeating node

        //We can use slow and fast pointers , just think of two ppl are running
        //when slow and fast match, and they will if it is repeating cycle , return true
        //If fast point to null and fast next point to null , return false

        //So We create two ListNode , slow = head and fast = head.next
        //slow = head.next , fast = head.next.next
        //if (slow == fast) return true

        //Bse case
        if (head == null || head.next == null) return false;


        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
