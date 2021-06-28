package com.problems.leetCode;


import com.util.ListNode;

/**
 * created by koujx on 2016/1/25.
 * #203. Remove Linked List Elements
 * Remove all elements from a linked list of integers that have value "val".
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode result = new ListNode(0);
        ListNode pNode = head;
        ListNode qNode = result;
        while (pNode!=null){
            if (pNode.val==val){
                pNode = pNode.next;
            }else {
                qNode.next = new ListNode(pNode.val);
                qNode = qNode.next;
                pNode = pNode.next;
            }
        }
        return result.next;
    }
    public ListNode removeElements1(ListNode head, int val) {
        if (head == null) return null;
        else {
            ListNode result = null;
            ListNode pNode = head;
            ListNode currentNode = null;
            while (pNode != null && result == null) {
                if (pNode.val == val) pNode = pNode.next;
                else {
                    currentNode = new ListNode(pNode.val);
                    result = currentNode;
                }
            }
            if (pNode == null) return result;
            else {
                while (pNode.next != null) {
                    if (pNode.next.val != val) {
                        currentNode.next = new ListNode(pNode.next.val);
                        currentNode = currentNode.next;
                        pNode = pNode.next;
                    } else {
                        pNode = pNode.next;
                    }
                }
            }
            return result;
        }

    }
}
