package com.mindhacks.ChapterTwo;


public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        if (A == null || n == 0) {
            return null;
        }
        merge(A, 0, A.length - 1);
        return A;
    }

    public void merge(int[] A, int left, int right) {
        if (left == right) {
            return;
        }
        int middle = (left + right) / 2;
        merge(A, left, middle);
        merge(A, middle + 1, right);
        compare(A, left, middle, right);
    }

    public void compare(int[] A, int left, int middle, int right) {
        int[] tempArray = new int[right - left + 1];
        int l = left;
        int r = middle;
        int index = 0;
        while (l <= middle && r <= right) {
            if (A[l] < A[r]) {
                tempArray[index++] = A[l++];
            } else {
                tempArray[index++] = A[r++];
            }
        }

        while (l <= left) {
            tempArray[index] = A[l++];
        }
        while (r < right) {
            tempArray[index] = A[r++];
        }
        for (int n = 0; n < tempArray.length; n++) {
            A[left++] = tempArray[n];
        }
    }
}