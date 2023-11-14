package Leetcode.LinkedList;

public class RemoveNthNodeFromEndOfList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //Solution 1 : Two Pass
    //The reason of call this as Two pass is that it search the ListNode twice
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // The idea is to find the index we want to remove
        // By doing node length - n - 1
        // For example: head = [1,2,3,4,5], n = 2
        // Head length is 5, and since index starts from 0, we need to: 5 - n - 1;

        // Now we found the n index, what we need to do is node before n .next pointer to node before n .next.next

        int length = 0;
        ListNode dummy = head;

        // This while loop is for counting how many lengths in ListNode
        while (dummy != null) {
            dummy = dummy.next;
            length++;
        }

        // Edge case: what if the n node is the head node?
        // Just point to head.next which val is null
        if (length == n) return head.next;

        // Looking for the n index
        int nIndex = length - n - 1;
        // Point to the head node again
        dummy = head;
        // It will find the node before n
        for (int i = 0; i < nIndex; i++) {
            dummy = dummy.next;
        }
        // Skip the n, point to node before n.next.next
        dummy.next = dummy.next.next;

        return head;
    }

    //Solution 2 : One pass
    //The idea is using Two pointer , one point to node before n , one point to after n
    //What we need to do is node before n.next point to node before n.next.next
    class Solution {
        public ListNode removeNthFromEnd2(ListNode head, int n) {
            ListNode dummy = head;
            for (int i = 0; i < n; i++) {
                //Now dummy will point to the node before n
                dummy = dummy.next;
            }

            if (dummy == null) return head.next;

            ListNode nodeBeforeN = head;

            //dummy pointer will point twice faster
            //nodeBeforeN pointer will point slower one time than dummy pointer
            while (dummy.next != null) {
                dummy = dummy.next;
                nodeBeforeN = nodeBeforeN.next;
            }
            nodeBeforeN.next = nodeBeforeN.next.next;

            return head;
        }
    }
}
