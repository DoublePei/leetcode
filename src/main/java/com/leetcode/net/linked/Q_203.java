package com.leetcode.net.linked;

/**
 * 题意：删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例 1：
 * 输入：head = [1,2,6,3,4,5,6], val = 6
 * 输出：[1,2,3,4,5]
 * <p>
 * 示例 2：
 * 输入：head = [], val = 1
 * 输出：[]
 * <p>
 * 示例 3：
 * 输入：head = [7,7,7,7], val = 7
 * 输出：[]
 * <p>
 * #
 */
public class Q_203 {


    public static void main(String[] args) {


    }
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);

        ListNode pre = dummy;
        ListNode cur = head;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }

            cur = cur.next;
        }
        return dummy.next;
    }

    public ListNode removeElement(ListNode head, int val) {
        //先判断head要不要去掉
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (cur.val == val) {
                pre.next = cur.next;
            } else {
                pre = cur;
            }
            cur = cur.next;
        }
        return head;
    }
}
