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
}
