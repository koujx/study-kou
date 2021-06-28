package com.problems.jianZhiOffer;

import com.util.ListNode;

import java.util.HashSet;

/**
 * Created by koujx on 2016/5/12.
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class FirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashSet<ListNode> nodes = new HashSet<ListNode>();
        while (pHead1 != null && pHead2 != null) {
            if (nodes.contains(pHead1)) return pHead1;
            else {
                nodes.add(pHead1);
                pHead1 = pHead1.next;
            }
            if (nodes.contains(pHead2)) return pHead2;
            else {
                nodes.add(pHead2);
                pHead2 = pHead2.next;
            }
        }
        return null;
    }
}
