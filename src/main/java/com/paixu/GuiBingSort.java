package com.paixu;

/**
 * @Description: 归并排序
 * @Author:MindHacks
 * @Date:2018-04-16 12:23:45
 * @wiki:
 */
public class GuiBingSort {
    public int[] mergeSort(int[] A, int n) {
        if (A == null || n == 0) {
            return null;
        }
        process(A, 0, n - 1);
        return A;
    }

    public static void process(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        int middle = (left + right) / 2;
        process(array, left, middle);
        process(array, middle + 1, right);
        compare(array,left,middle,right);
    }

    public static void compare(int[] array, int left, int middle, int right) {
        int[] tempArray = new int[right - left + 1];
        int l = left;
        int r = middle + 1;
        int index = 0;
        while (l <= middle && r <= right) {
            if (array[l] < array[r]) {
                tempArray[index++] = array[l++];
            } else {
                tempArray[index++] = array[r++];
            }
        }
        while (l <= middle) {
            tempArray[index++] = array[l++];
        }
        while (r <=right) {
            tempArray[index++] = array[r++];
        }
        for (int n = 0; n < tempArray.length; n++) {
            array[left++] = tempArray[n];
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
