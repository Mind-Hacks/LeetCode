package com.paixu;

/**
 * @Description:快速排序
 * @Author:MindHacks
 * @Date:2018-04-13 00:15:21
 * @wiki:
 * 通过排序将记录分割成独立的两部分，一部分比另外一部分小，然后对两部分继续排序，直到有序
 */
public class KuiSuSort {


    public static void process(int[] array, int left, int right) {
        if (left < right) {
            int random = left + (right - left) / 2;
            swap(array, random, right);
            int middle = partition(array, left, right);
            process(array, left, middle - 1);
            process(array, middle + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int temp = left - 1;
        while (left <= right) {                     //有等号的目的是将 末尾元素，放到分界线处
            if (array[left] <= array[right]) {
                swap(array, left, ++temp);
            }
            left++;
        }
        return temp;
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int a[] = {54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        KuiSuSort.process(a, 0, a.length - 1);
        for (int n = 0; n < a.length; n++) {
            System.out.print(a[n] + ",");
        }
    }
}
