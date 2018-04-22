package com.offer;


import java.util.Stack;

/**
 * @Description: 包含min函数的栈
 * @Author:MindHacks
 * @Date:2018-04-21 22:15:28
 * @wiki: 应用一个辅助栈，压的时候，如果A栈的压入比B栈压入大，B栈不压，，，，小于等于
 * ，AB栈同时压入，出栈，如果，AB栈顶元素不等，A出，B不出。
 */
public class No21 {
    private Stack<Integer> data = new Stack();
    private Stack<Integer> min = new Stack();

    public void push(int node) {
        if (min.empty() || node < min.peek()) {
            min.push(node);
        } else {
            min.push(min.peek());
        }
        data.push(node);
    }

    public void pop() {
        data.pop();
        min.pop();
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return min.peek();
    }
}
