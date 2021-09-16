package com.leetcode.net.linked;
class Q_206 {

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;

        while (cur!=null){

            tmp = cur.next;
            cur.next = pre;//翻转
            pre = cur;
            cur = tmp;
        }
    return pre;
    }






}
