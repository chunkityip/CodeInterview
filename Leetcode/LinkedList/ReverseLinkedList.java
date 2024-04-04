package Leetcode.LinkedList;

public class ReverseLinkedList {

    public class ListNode {
      int val;
      ListNode next;
    ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public ListNode reverseListIteratively(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    public ListNode reverseListRecursively(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode p = reverseListRecursively(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }
}
