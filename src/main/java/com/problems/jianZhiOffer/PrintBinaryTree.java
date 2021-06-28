package com.problems.jianZhiOffer;

import com.util.TreeNode;

import java.util.ArrayList;

/**
 * Created by koujx on 2016/5/12.
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class PrintBinaryTree {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return result;
        } else {
            ArrayList<TreeNode> queue = new ArrayList<TreeNode>();
            int next = 0;
            queue.add(pRoot);
            int current = 1;
            while (!queue.isEmpty()) {
                ArrayList<Integer> c = new ArrayList<Integer>();
                while (current > 0) {
                    TreeNode node = queue.remove(0);
                    c.add(node.val);
                    System.out.print(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                        next++;
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                        next++;
                    }
                    current--;
                }
                result.add(c);
                current = next;
                next = 0;
            }
            return result;
        }
    }
}
