package com.offer;


import java.util.Stack;

/**
 * @Description: 栈与队列的实现
 * @Author:MindHacks
 * @Date:2018-04-05 16:15:17
 * @wiki:
 */
public class No07 {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public static void main(String[] args) {

    }


    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()){
                return  -1;
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
