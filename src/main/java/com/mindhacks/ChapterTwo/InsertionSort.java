package com.mindhacks.ChapterTwo;

import java.util.*;

/**
 * 插入排序：每次插入后，数据都是有顺序的
 */
public class InsertionSort {
    public int[] insertionSort(int[] A, int n) {
        // write code here
        for (int m = 0; m < n; m++) {
            int temp = m;
            for (int k = 0; k < m && temp > 0; k++) {
                if (A[temp] < A[temp - 1]) {
                    int stage = A[temp];
                    A[temp] = A[temp - 1];
                    A[temp - 1] = stage;
                }
                temp--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int a[] = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        int b[] = new InsertionSort().insertionSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}