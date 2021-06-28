package com.problems.leetCode;

import com.util.ListNode;

/**
 * Created by 902 on 2016/4/1.
 * #24. Swap Nodes in Pairs
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
public class SwapPairs {
    public static ListNode swapPairs(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {
            int temp = current.val;
            current.val = current.next.val;
            current.next.val = temp;
            current = current.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode head = listNode;
        for (int i = 2; i < 3; i++) {
            ListNode n = new ListNode(i);
            listNode.next = n;
            listNode = listNode.next;
        }

        swapPairs(head);
        System.out.println(head.toString());
    }
}
