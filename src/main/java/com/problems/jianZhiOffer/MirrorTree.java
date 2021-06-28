package com.problems.jianZhiOffer;

import com.util.TreeNode;

/**
 * Created by koujx on 2016/5/12.
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 输入描述:
 * 二叉树的镜像定义：源二叉树
 * ------8
 * -----/  \
 * ----6   10
 * ---/ \  / \
 * --5  7 9   11
 * 镜像二叉树
 * -------8
 * -----/  \
 * ----10   6
 * ---/ \  / \
 * --11  9 7  5
 */
public class MirrorTree {
    public void Mirror(TreeNode root) {
        if ((root == null) || root.left == null && root.right == null) return;
        else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
