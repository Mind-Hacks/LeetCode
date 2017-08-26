package com.mindhacks.ChapterTwo;

import java.util.*;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public int[] bubbleSort(int[] A, int n) {
        for (int m = 0; m < n; m++) {
            for (int k = 0; k < (n - m - 1); k++) {
                if (A[k] > A[k + 1]) {
                    int temp = A[k];
                    A[k] = A[k + 1];
                    A[k + 1] = temp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int a[] = {3, 5, 7, 8, 8, 8, 10, 4454, 678, 10};
        int b[] = new BubbleSort().bubbleSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}