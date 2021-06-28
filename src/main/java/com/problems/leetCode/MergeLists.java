package com.problems.leetCode;


import com.util.ListNode;

/**
 * created by koujx on 2016/3/11.
 * #21.Merge Two Sorted Lists
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the
 * nodes of the first two lists.
 */
public class MergeLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) return null;
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		else {
			ListNode current = null;
			ListNode result = null;
			ListNode pNext;
			while (l1 != null && l2 != null) {
				if (l1.val <= l2.val) {
					pNext = new ListNode(l1.val);
					l1 = l1.next;
				} else {
					pNext = new ListNode(l2.val);
					l2 = l2.next;
				}
				if (result==null){
					result = pNext;
					current = pNext;
				}else {
					current.next = pNext;
					current = pNext;
				}
			}
			current.next = mergeTwoLists(l1, l2);
			return result;
		}
	}
}
