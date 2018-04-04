package com.nowcoder.ChapterTwo;

import com.nowcoder.ArrayUtil;

/**
 * 选择排序：每次选择一个最小的数据
 */
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        for (int m = 0; m < n; m++) {
            for (int point = m; point < n; point++) {
                if (A[m] > A[point]) {
                    ArrayUtil.changeValue(A, m, point);
                }
            }
        }
        return A;
    }


    public static void main(String[] args) {
        int a[] = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        int b[] = new SelectionSort().selectionSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}