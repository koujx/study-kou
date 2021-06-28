package com.problems.leetCode;

import java.util.*;

public class TreeReverse {

    public static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(2);
        TreeNode root3 = new TreeNode(3);
        TreeNode root4 = new TreeNode(4);
        TreeNode root5 = new TreeNode(5);
        TreeNode root6 = new TreeNode(6);
        TreeNode root7 = new TreeNode(7);
        root1.left = root2;
        root1.right = root3;
        root2.left = root4;
        root2.right = root5;
        root3.left = root6;
        root3.right = root7;

        printTree(root1);
        System.out.println("===========");

//        invertTree(root1);
//        System.out.println("===========");
//        printTree(root1);

        List<Integer> list = levelTraversal(root1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) {
            return res;
        }
        TreeNode node = root;
        stack.push(node);
        while (node != null || !stack.isEmpty()) {
            node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            node = null;
        }
        return res;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            res.add(node.val);
            if (node.right != null) {
                node = node.right;
            } else {
                node = null;
            }
        }
        return res;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        TreeNode last = null;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.peek();
            if (node.right != null && node.right != last) {
                node = node.right;
            } else {
                node = stack.pop();
                last = node;
                res.add(node.val);
                node = null;
            }
        }

        return res;
    }

    public static List<Integer> levelTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return res;
        }
        TreeNode node = root;
        queue.add(root);
        while (node != null || !queue.isEmpty()) {
            node = queue.remove();
            res.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            node = null;
        }

        return res;
    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        if (root.left == null && root.right == null) {
            return root;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode last = null;
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            if (node == null) {
                break;
            }
            while (node != null) {
                node = node.left;
                if (node != null) {
                    stack.push(node);
                }
            }
            node = stack.peek();
            if (node.right == null || node.right == last) {
                TreeNode tmp = node.left;
                node.left = node.right;
                node.right = tmp;
                stack.pop();
                last = node;
            } else {
                stack.push(node.right);
            }
        }
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);
    }
}
