package com.problems.leetCode;


import com.util.TreeNode;

/**
 * created by koujx on 2016/1/28.
 * #235. Lowest Common Ancestor of a Binary Search Tree
 * Given a binary search tree (BST-二叉有序树), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: ��The lowest common ancestor is defined between two nodes v and w
 * as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).��
 * -------------6
 * -----------/   \
 * ----------2     8
 * ---------/ \   / \
 * --------0   4 7   9
 * -----------/ \
 * ----------3   5
 * For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2,
 * since a node can be a descendant of itself according to the LCA definition.
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p == root || q == root) return root;
        int rVal = root.val;
        int pVal = p.val;
        int qVal = q.val;
        if ((pVal - rVal) * (qVal - rVal) > 0) {
            if (pVal < rVal) return lowestCommonAncestor(root.left, p, q);
            else return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }
}
