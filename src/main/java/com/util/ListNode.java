package com.util;

/**
 * Created by koujx on 2016/1/22.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }

    public void insertNode(int n) {
        ListNode nextNode = new ListNode(n);
        nextNode.next = this.next;
        this.next = nextNode;
    }

    public void deleteNode() {
        this.val = this.next.val;
        this.next = this.next.next;
    }
}
