package com.mindhacks.ChapterFour;

import java.util.Stack;

/**
 * @Description:返回栈中元素数量
 * @Author:mindHacks
 * @Date:2017年12月14日22:33
 * @wiki:
 */
public class TwoStack {


    public static int[] twoStack(int[] ope, int n) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stackBackup = new Stack<Integer>();
        for (int m = 0; m < ope.length; m++) {
            if (ope[m]==0 && !stack.isEmpty()){
                stack.pop();
            }else {
                stack.push(ope[m]);
            }
        }
        while (!stack.isEmpty()) {
            stackBackup.push(stack.pop());
        }
        if (stackBackup.size() == 0) {
            return null;
        } else {
            int[] nums = new int[stackBackup.size()];
            for (int m = 0; m < nums.length; m++) {
                nums[m] = stackBackup.pop();
            }
            return nums;
        }
    }

}