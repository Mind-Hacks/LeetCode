package com.offer;


import java.util.Stack;

/**
 * @Description: 栈的压入、弹出序列
 * @Author:MindHacks
 * @Date:2018-04-21 22:15:28
 * @wiki: 输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的
 */
public class No22 {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (popA == null || popA.length == 0) {
            return false;
        }
        int point = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int m = 0; m < pushA.length; m++) {
            stack.push(pushA[m]);
            while (!stack.isEmpty() && stack.peek() == popA[point]){
                stack.pop();
                point++;
            }
        }
        return stack.isEmpty();
    }
}
