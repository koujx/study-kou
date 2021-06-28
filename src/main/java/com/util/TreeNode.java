package com.util;

import java.util.ArrayList;

/**
 * created by koujx on 2016/1/25.
 */
public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public ArrayList nodeList;

	public TreeNode(int x) {
		val = x;
	}

	public TreeNode(ArrayList list) {
		this.nodeList = list;
	}


	/**
	 * created by koujx on 2016/1/25.
	 * #104. Maximum Depth of Binary Tree
	 * Given a binary tree, find its maximum depth.
	 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf
	 * node.
	 */
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			int maxL = 1;
			return Math.max(Math.max(maxDepth(root.left), maxDepth(root.right)) + 1, maxL);
		}
	}

	/**
	 * created by koujx on 2016/1/26.
	 * #100. Same Tree
	 * Given two binary trees, write a function to check if they are equal or not.
	 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
	 */
	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		}
		if (p != null && q != null) {
			return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
		} else {
			return false;
		}
	}

	/**
	 * created by koujx on 2016/3/15.
	 * #110.balanced binary tree
	 * Given a binary tree, determine if it is height-balanced.
	 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two
	 * subtrees of every node never differ by more than 1.
	 */
	public boolean isBalanced(TreeNode root) {
		if (root == null || (root.left == null && root.right == null)) {
			return true;
		} else {
			return (isBalanced(root.left) && isBalanced(root.right))
					&& (Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1);
		}
	}

	/**
	 * created by koujx on 2016/3/15.
	 * #101. Symmetric Tre
	 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
	 * For example, this binary tree is symmetric:
	 * ----------1
	 * ---------/ \
	 * --------2   2
	 * -------/ \ / \
	 * ------3  4 4  3
	 * But the following is not:
	 * ----------1
	 * ---------/ \
	 * --------2   2
	 * ---------\   \
	 * ----------3   3
	 * Note:
	 * Bonus points if you could solve it both recursively and iteratively.
	 * confused what "{1,#,2,3}" means?
	 */
	/*//递归
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		} else {
			return isSame(root.left, root.right);
		}
	}
	private boolean isSame(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		}  if (left != null && right == null || left == null && right != null){
			return false;
		} else {
			return left.val == right.val && isSame(left.left, right.right) && isSame(left.right, right.left);
		}
	}*/
	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		if (root.left == root.right) {
			return true;
		}
		ArrayList valList = new ArrayList();
		TreeNode tree = new TreeNode(valList);
		tree.LNR(root);
		int l = valList.size();
		if (l % 2 == 0) {
			return false;
		} else {
			for (int i = 0; i < l / 2; i++) {
				if (valList.get(i) != valList.get(l - i - 1)) {
					return false;
				}
			}
			return true;
		}
	}

	//中序遍历
	public void LNR(TreeNode root) {
		if (root == null) {
			this.nodeList.add(null);
		} else {
			if (root.left == null && root.right == null) {
				this.nodeList.add(root.val);
			} else {
				LNR(root.left);
				this.nodeList.add(root.val);
				LNR(root.right);
			}
		}
	}
//	//先序遍历
//	public void NLR(TreeNode root) {
//		if (root == null) return;
//		else {
//			visit(root);
//			visit(root.left);
//			visit(root.right);
//		}
//	}
//
//	//后序遍历
//	public void LRN(TreeNode root) {
//		if (root == null) return;
//		else {
//			visit(root.left);
//			visit(root.right);
//			visit(root);
//		}
//	}
}
