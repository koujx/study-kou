package com.problems.leetCode;


import com.util.TreeNode;

/**
 * created by koujx on 2016/1/26.
 * #226. Invert Binary Tree
 * Invert a binary tree.
 * -----------4
 * ---------/   \
 * --------2     7
 * -------/ \   / \
 * ------1   3 6   9
 * to
 * -----------4
 * ---------/   \
 * --------7     2
 * -------/ \   / \
 * ------9   6 3   1
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode result = root;
        TreeNode pNode = result.left;
        result.left = invertTree(result.right);
        result.right = invertTree(pNode);
        return result;
    }
}
