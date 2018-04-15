package com.paixu;

/**
 * @Description: 希尔排序
 * @Author:MindHacks
 * @Date:2018-04-15 22:01:27
 * @wiki: 将相距某个“增量”的记录组织一个子序列，
 * 保证子序列内分别进行直接插入排序后得到的结果基本有序
 */
public class XiErSort {

    public int[] shellSort(int[] A, int n) {
        if (A == null || n == 0) {
            return null;
        }
        int feet = n / 2;
        while (feet > 0) {
            for (int i = feet; i < n; i++) {
                int temp = i;
                while (temp >= feet) {  //大于feet，是因为这是基础组
                    if (A[temp - feet] > A[temp]) {
                        swap(A, temp - feet, temp);
                        temp -= feet;
                    } else {
                        break;
                    }
                }
            }
            feet = feet / 2;
        }
        return A;
    }


    public static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
