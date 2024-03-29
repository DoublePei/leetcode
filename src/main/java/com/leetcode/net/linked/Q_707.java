package com.leetcode.net.linked;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class MyLinkedList {
    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }


    public int get(int index) {
        if (index < 0 || index > size) {
            return -1;
        }

        ListNode currentNode = head;

        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    public void addIndex(int index, int val) {

        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;

        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    public void addAtHead(int val) {
        addIndex(0, val);
    }

    public void addAtTail(int val) {
        addIndex(size, val);
    }

    public void deleteIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }

        pred.next = pred.next.next;

    }
    }

