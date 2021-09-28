package com.leetcode.net.linked;

import java.util.HashMap;
import java.util.Map;

/**链表
 * 环形
 */
public class Q_142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            //相遇了
            if (fast == slow) {
                ListNode index1 = fast;
                ListNode index2 = head;

                while (index1 != index2) {
                    index1 = index1.next;
                    index2 = index2.next;
                }
                return index1;
            }
        }
        return null;
    }

    public ListNode detectCycle2(ListNode head) {

        Map<ListNode,ListNode> map = new HashMap<>();
        if(head== null){
            return null;
        }

        while (head.next!=null){
            if(map.containsKey(head)){
                return head;
            }
            map.put(head,head);
            head = head.next;
        }
        return null;
    }


}
