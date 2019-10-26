package LeetCode;

import java.util.Stack;

public class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stack = null;
    Stack<Integer> minStack = null;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty()){
            minStack.push(x);
        }else {
            if (x <= minStack.peek()){
                minStack.push(x);
            }
        }
    }

    public void pop() {
        int val = stack.pop();
        if (val == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
