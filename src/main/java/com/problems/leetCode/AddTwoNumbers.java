package com.problems.leetCode;

import com.util.ListNode;

/**
 * Created by koujx on 2016/1/22.
 * 2.Add Two Numbers
 * ListNode
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l = null;
        ListNode point = null;
        ListNode pNext;
        int add = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + add;
            add = sum / 10;
            pNext = new ListNode(sum % 10);
            if (l == null) {
                l = pNext;
                point = pNext;
            } else {
                point.next = pNext;
                point = pNext;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            int sum = l1.val + add;
            pNext = new ListNode(sum % 10);
            add = sum / 10;
            point.next = pNext;
            point = pNext;
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.val + add;
            pNext = new ListNode(sum % 10);
            add = sum / 10;
            point.next = pNext;
            point = pNext;
            l2 = l2.next;
        }
        if (add != 0) {
            pNext = new ListNode(add);
            point.next = pNext;
        }
        return l;
    }
}
