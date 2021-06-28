package com.problems.leetCode;

import com.util.ListNode;

/**
 * #206.Reverse Linked List
 * Reverse a singly linked list.
 * created by koujx on 2016/3/2.
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        //递归
        if(head==null||head.next==null) {
            return head;
        }
        ListNode p = head.next;
        ListNode n = reverseList(p);
        head.next = null;
        p.next = head;
        return n;

/*
        //遍历
        if (head == null || head.next == null) return head;
        ListNode result = new ListNode(head.val);
        while (head.next != null) {
            head = head.next;
            ListNode current = new ListNode(head.val);
            current.next = result;
            result = current;
        }
        return result;
*/


        /*        //Stack
        ListNode result = head;
        if (head == null || head.next == null) return result;
        Stack stack = new Stack();
        while (result.next != null) {
            ListNode current = new ListNode(result.val);
            stack.push(current);
            result = result.next;
        }
        ListNode trail = result;
        while (!stack.empty()) {
            result.next = (ListNode) stack.pop();
            result = result.next;
        }
        return trail;*/
    }
}
