package com.leetcode.net.linked;

public class Q_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (n <= 0) {
            return head;
        }

        ListNode dummy = new ListNode(0);

        dummy.next = head;
        int fast = 0;

        ListNode fastNode = dummy;
        ListNode slowNode = dummy;

        while (fastNode.next != null) {
            if (fast < n ) {
                fastNode = fastNode.next;
                fast++;
            } else {
                fastNode = fastNode.next;
                slowNode = slowNode.next;
            }

        }
        slowNode.next = slowNode.next.next;
        return dummy.next;
    }
}
