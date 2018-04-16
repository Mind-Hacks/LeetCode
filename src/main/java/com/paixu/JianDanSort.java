package com.paixu;

/**
 * @Description: 简单选择排序
 * @Author:MindHacks
 * @Date:2018-04-16 10:23:29
 * @wiki: 通过n-1次关键词之间的比较，从n-i+1个记录中选出关键字最小的记录
 * 和第i个记录之间进行交换（i=1,2,3.....）
 */
public class JianDanSort {

    public static int[] selectionSort(int[] A, int n) {
        if (A == null || n == 0) {
            return null;
        }
        for (int m = 0; m < n - 1; m++) {
            int min = A[m];
            for (int k = m + 1; k < n; k++) {
                if (min > A[k]){
                    int temp = A[k];
                    A[k] = min;
                    min = temp;
                }
            }
            A[m] = min;
        }
        return A;
    }
    public static void main(String[] args) {
        int a[] = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        int b[] = JianDanSort.selectionSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}
