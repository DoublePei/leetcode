package com.leetcode.net.linked;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
class Q_24 {

    public ListNode swapPairs(ListNode head) {

        ListNode dummy  = new ListNode(0);
        dummy.next = head;

        ListNode pred = dummy;
        //https://leetcode-cn.com/problems/swap-nodes-in-pairs/solution/liang-liang-jiao-huan-lian-biao-zhong-de-jie-di-91/
        while (pred.next!=null && pred.next.next!=null){
            ListNode node1  = pred.next;
            ListNode node2 = pred.next.next;

            pred.next = node2;
            node1.next = node2.next;
            node2.next = node1;

            pred = node1;
        }
        return dummy.next;
    }
}
