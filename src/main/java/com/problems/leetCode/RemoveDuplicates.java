package com.problems.leetCode;


import com.util.ListNode;

/**
 * created by koujx on 2016/3/11.
 * #83 Remove Duplicates from Sorted List
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 */
public class RemoveDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode resurt = head;
		if (head == null) return null;
		while (head.next != null) {
			if (head.val == head.next.val) head.next = head.next.next;
			else head = head.next;
		}
		return resurt;
	}
}
