package com.nowcoder.ChapterFour;

import com.nowcoder.ArrayUtil;

//思路：利用递归，将栈中数据反转
public class StackReverse {
    public static int[] reverseStack(int[] A, int n) {
        if (n== 0) {
            return A;
        }
        int current = get(A, n);
        n--;
        reverseStack(A, n);
        A[n] = current;
        return A;
    }

    //获取栈低元素
    public static int get(int[] A, int n) {
        int result = A[n-1];
        n--;
        if (n == 0) {
            return result;
        } else {
            int last = get(A, n);
            A[n-1] = result;
            return last;
        }
    }

    public static void main(String[] args) {
        int[] stacks = new int[]{3, 5, 6, 7, 8};
        reverseStack(stacks, stacks.length);
        ArrayUtil.printAyyay(stacks, stacks.length);
    }

}