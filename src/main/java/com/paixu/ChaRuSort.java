package com.paixu;

/**
 * @Description:将一个记录插入到已经排好序的有序列表中，得到一个新的有序列表
 * @Author:MindHacks
 * @Date:2018-04-15 21:17:28
 * @wiki:
 */
public class ChaRuSort {

    public void insertPaiXu(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            int temp = i;
            while (temp > 0) {
                if (array[temp] < array[temp - 1]) {
                    swap(array, temp, temp - 1);
                }
                temp--;
            }
        }
    }

    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
