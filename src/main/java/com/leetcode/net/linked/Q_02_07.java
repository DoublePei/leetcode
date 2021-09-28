package com.leetcode.net.linked;

public class Q_02_07 {

    /**
     *         """
     *         根据快慢法则，走的快的一定会追上走得慢的。
     *         在这道题里，有的链表短，他走完了就去走另一条链表，我们可以理解为走的快的指针。
     *
     *         那么，只要其中一个链表走完了，就去走另一条链表的路。如果有交点，他们最终一定会在同一个
     *         位置相遇
     *         """
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la = headA;
        ListNode lb = headB;
        while(la != lb){
            //到达链表末尾时，重新走另一条链表的路
            la = la == null ? headB : la.next;
            lb = lb == null ? headA : lb.next;
        }
        return la;
    }
}
