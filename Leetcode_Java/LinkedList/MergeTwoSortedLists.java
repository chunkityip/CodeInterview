package Leetcode_Java.LinkedList;

public class MergeTwoSortedLists {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    public ListNode mergeTwoListsByRecursion(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoListsByRecursion(list1.next , list2);
            return list1;
        } else {
            list2.next = mergeTwoListsByRecursion(list1 , list2.next);
            return list2;
        }
    }

    public ListNode mergeTwoListsByIteration(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode(-1);

            ListNode prev = dummy;

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    prev.next = list1;
                    list1 = list1.next;

                } else {
                    prev.next = list2;
                    list2 = list2.next;
                }
                prev = prev.next;
            }

            prev.next = list1 == null ? list2 : list1;
            return dummy.next;
        }
}
