package com.mindhacks.ChapterTwo;

import java.util.*;

/**
 * 选择排序
 */
public class SelectionSort {
    public int[] selectionSort(int[] A, int n) {
        // write code here
        for (int m = 0; m < n - 1; m++) {
            int min = A[m];
            for (int k = m + 1; k < n; k++) {
                if (min > A[k]) {
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
        int b[] = new SelectionSort().selectionSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}