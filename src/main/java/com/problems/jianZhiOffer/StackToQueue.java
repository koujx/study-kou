package com.problems.jianZhiOffer;

import java.util.Stack;

/**
 * Created by koujx on 2016/5/11.
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class StackToQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack2.push(node);
    }

    public int pop() {
        if (!stack1.isEmpty()) {
            return stack1.pop();
        } else {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            return stack1.pop();
        }
    }

    public int NumberOf1(int n) {
        int sum = 0;
        int i = 1;
        while (i != 0) {
            if ((n & i) != 0) sum++;
            i = i << 1;
        }
        return sum;
    }
}
