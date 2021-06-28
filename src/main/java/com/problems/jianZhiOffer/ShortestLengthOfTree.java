package com.problems.jianZhiOffer;

/**
 * Created by koujx on 2016/4/14.
 * [编程题] 二叉树
 * 有一棵二叉树，树上每个点标有权值，权值各不相同，请设计一个算法算出权值最大的叶节点到权值最小的叶节点的距离。二叉树每条边的距离为1，一个节点经过多少条边到达另一个节点为这两个节点之间的距离。
 * 给定二叉树的根节点root，请返回所求距离。
 */
public class ShortestLengthOfTree {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public int getDis(TreeNode root) {
        // write code here
        if (root == null || (root.left == null && root.right == null)) return 0;
        else {
            int length = 0;
            int max = maxValue(root);
            int min = minValue(root);
            int lmax = maxValue(root.left);
            int lmin = minValue(root.left);
            if (lmax == max && lmin == min) {
                return getDis(root.left);
            } else if (lmax == max && lmin != min) {
                return getDepth(root.left, max) + getDepth(root.right, min);
            } else if (lmax != max && lmin == min) {
                return getDepth(root.left, min) + getDepth(root.right, max);
            } else {
                return getDis(root.right);
            }
        }
    }

    public int getDepth(TreeNode root, int value) {
        if (root == null) return 0;
        else {
            if (root.val == value) return 0;
            else {
                return Math.max(getDepth(root.left, value), getDepth(root.right, value));
            }
        }
    }

    public int maxValue(TreeNode root) {
        if (root == null) return 0;
        else {
            int max = root.val;
            int lmax = maxValue(root.left);
            int rmax = maxValue(root.right);
            return Math.max(max, Math.max(lmax, rmax));
        }
    }

    public int minValue(TreeNode root) {
        if (root == null) return 0;
        else {
            int min = root.val;
            int lmin = minValue(root.left);
            int rmin = minValue(root.right);
            return Math.min(min, Math.min(lmin, rmin));
        }
    }


}
