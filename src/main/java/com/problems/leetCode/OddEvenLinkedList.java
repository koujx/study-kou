package com.problems.leetCode;

import com.util.ListNode;

import java.util.LinkedList;

/**
 * Created by koujx on 2016/1/22.
 * 328. Odd Even Linked List
 */
public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode pNode = head;
        int number = 1;
        LinkedList<Integer> oddList = new LinkedList<Integer>();
        LinkedList<Integer> evenList = new LinkedList<Integer>();
        while (pNode != null) {
            if (number % 2 == 1) oddList.add(pNode.val);
            else evenList.add(pNode.val);
            pNode = pNode.next;
            number++;
        }
        ListNode point = null;
        ListNode result = null;
        ListNode nextPoint;
        for (Integer anOddList : oddList) {
            nextPoint = new ListNode(anOddList);
            if (point == null) {
                result = nextPoint;
                point = nextPoint;
            } else {
                point.next = nextPoint;
                point = point.next;
            }
        }
        for (Integer anEvenList : evenList) {
            nextPoint = new ListNode(anEvenList);
            if (point == null) {
                result = nextPoint;
                point = nextPoint;
            } else {
                point.next = nextPoint;
                point = point.next;
            }
        }
        return result;
    }
}
