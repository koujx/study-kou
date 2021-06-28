package com.problems.jianZhiOffer;

import com.util.ListNode;

/**
 * Created by koujx on 2016/5/16.
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class MergeLinkedList {
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 != null && list2 != null) {
            ListNode current = new ListNode(0);
            ListNode head = current;
            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    current.next = list1;
                    current = current.next;
                    list1 = list1.next;
                }else {
                    current.next = list2;
                    current = current.next;
                    list2=list2.next;
                }
            }
            current.next = Merge(list1, list2);
            return head.next;
        } else if (list1 != null) return list1;
        else return list2;
    }

    public static void main(String[] a) {
    }
}
