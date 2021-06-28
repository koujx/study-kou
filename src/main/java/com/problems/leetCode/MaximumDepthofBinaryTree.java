package com.problems.leetCode;

import com.util.TreeNode;

/**
 * created by koujx on 2016/1/25.
 * #104.Maximum Depth of Binary Tree
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */
public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            int maxL = 1;
            return Math.max(Math.max(maxDepth(root.left),maxDepth(root.right))+1,maxL);
        }
    }
}
