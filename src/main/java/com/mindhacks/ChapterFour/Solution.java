package com.mindhacks.ChapterFour;

import java.util.Stack;

/**
 * @Description: 返回栈中最小元素
 * @Author:mindHacks
 * @Date:2017年12月14日1:00
 * @wiki:
 */
public class Solution {
    //其实函数递归调用，都可以用栈进行实现
    private Stack<Integer> initStack = new Stack<Integer>();

    private Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        initStack.push(node);
        if (minStack.isEmpty() || minStack.size() == 0 || minStack.peek() < initStack.peek()) {
            minStack.push(node);
        }
    }

    public void pop() {
        if (initStack.empty()) {
            throw new RuntimeException("Your stack is empty!");
        }
        if (initStack.peek() == minStack.peek()) {
            minStack.pop();
        }
        initStack.pop();
    }

    public int top(Stack<Integer> stack) {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}