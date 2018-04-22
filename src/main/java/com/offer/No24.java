package com.offer;


/**
 * @Description: 二叉搜索树的后序遍历
 * @Author:MindHacks
 * @Date:2018-04-22 12:10:03
 * @wiki: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class No24 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return process(sequence, 0, sequence.length - 1);
    }

    public static Boolean process(int[] array, int left, int right) {
        if (left >= right) {
            return true;
        }
        int temp = right;
        while (temp > left && array[temp - 1] > array[right]) {
            temp--;
        }
        for (int j = temp - 1; j >=left; j--) {
            if (array[j] > array[right]) {
                return false;
            }
        }
        return process(array, left, temp - 1) && process(array, temp, right-1);
    }
}
