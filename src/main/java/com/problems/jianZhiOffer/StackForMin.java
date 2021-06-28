package com.problems.jianZhiOffer;

import java.util.Stack;

/**
 * Created by koujx on 2016/5/16.
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
 */
public class StackForMin {
    Stack<Integer> stack = new Stack<Integer>();

    public void push(int node) {
        stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        Stack<Integer> stackNew = new Stack<Integer>();
        int min = this.top();
        while (!this.stack.isEmpty()) {
            int node = this.stack.pop();
            if (node < min) {
                min = node;
                stackNew.push(node);
            }
        }
        while (!stackNew.isEmpty()) {
            this.stack.push(stackNew.pop());
        }
        return min;
    }
}
