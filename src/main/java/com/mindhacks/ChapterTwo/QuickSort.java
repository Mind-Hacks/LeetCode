package com.mindhacks.ChapterTwo;

import com.mindhacks.ArrayUtil;

public class QuickSort {
    public int[] quickSort(int[] A, int n) {
        if (A == null || A.length == 1) {
            return A;
        }
        quickCut(A, 0, n - 1);
        return A;
    }


    public void quickCut(int[] A, int left, int right) {
        if (left < right) {
            int middle = process(A, left, right);
            quickCut(A, left, middle - 1);
            quickCut(A, middle + 1, right);
        }
    }

    public int process(int[] A, int left, int right) {
        int breakPoint = left - 1;
        int index = left;
        while (index <= right) {
            if (A[index] <=A[right]) {      //TODO  这一块为什么是<=
                ArrayUtil.changeValue(A, ++breakPoint, index);
            }
            index++;
        }
        return breakPoint;
    }


    public static void main(String[] args) {
        int a[] = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        int b[] = new QuickSort().quickSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}