package com.util;


import java.util.Stack;

/**
 * created by koujx on 2016/3/15.
 * #232. Implement Queue using Stacks
 * Implement the following operations of a queue using stacks.
 * ----push(x) -- Push element x to the back of queue.
 * ----pop() -- Removes the element from in front of queue.
 * ----peek() -- Get the front element.
 * ----empty() -- Return whether the queue is empty.
 * Notes:
 * ----You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and
 * ----is empty operations are valid.
 * ----Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or
 * ----deque (double-ended queue), as long as you use only standard operations of a stack.
 * ----You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty
 * ----queue).
 */
public class MyQueue {
	private Stack<Integer> stack = new Stack();

	// Push element x to the back of queue.
	public void push(int x) {
		this.stack.push(x);
	}

	// Removes the element from in front of queue.
	public void pop() {
		Stack newStack = new Stack();
		while (!this.stack.isEmpty()) {
			newStack.push(this.stack.peek());
			this.stack.pop();
		}
		newStack.pop();
		while (!newStack.isEmpty()) {
			this.stack.push((Integer) newStack.peek());
			newStack.pop();
		}
	}

	// Get the front element.
	public int peek() {
		Stack<Integer> newStack = new Stack();
		while (!this.stack.isEmpty()) {
			newStack.push(this.stack.peek());
			this.stack.pop();
		}
		int result = (int) newStack.peek();
		while (!newStack.isEmpty()) {
			this.stack.push(newStack.peek());
			newStack.pop();
		}
		return result;
	}

	// Return whether the queue is empty.
	public boolean empty() {
		return this.stack.isEmpty();
	}
}
