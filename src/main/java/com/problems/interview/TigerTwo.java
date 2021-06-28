package com.problems.interview;

import com.util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 查找某个节点是否在二叉树内，并打印出位置
 *     5
 *  1    3
 * 2 X  9 4
 * （X表示空节点）
 *
 *
 * 查找节点：9
 * 结果：2,1（2-第三层，1-该层第二个节点）
 *
 * 查找节点：7
 * 结果：（未找到，不打印位置）
 *
 *
 * @Author: koujiaxing
 * @Date: 2021/4/15 下午2:28
 */
public class TigerTwo {

    public static void main(String[] args) {

    }

    public void func(TreeNode node, int v){
        int level, location;
        if(node == null){
            return;
        }
        if(node.val == v){
            level = 0;
            location = 0;
            System.out.println(level + "," + location);
            return;
        }
        Queue<TreeNode> parentQueue = new LinkedList<>();
        Queue<TreeNode> childQueue = new LinkedList<>();

        parentQueue.offer(node);
        level = 0;
        location = -1;
        while (!parentQueue.isEmpty() && !childQueue.isEmpty()) {
            if (parentQueue.isEmpty() && !childQueue.isEmpty()) {
                level++;
                location = -1;
                Queue<TreeNode> temp = parentQueue;
                parentQueue = childQueue;
                childQueue = temp;
            }
            TreeNode p = parentQueue.poll();
            location++;
            if (p.val == v) {
                System.out.println(level + "," + location);
                return;
            }

            if (p.left != null) {
                childQueue.add(p.left);
            }
            if (p.right != null) {
                childQueue.add(p.right);
            }
        }
        return;
    }
}
