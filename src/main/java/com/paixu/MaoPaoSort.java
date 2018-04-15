package com.paixu;

/**
 * @Description:冒泡排序
 * @Author:MindHacks
 * @Date:2018-04-13 00:09:35
 * @wiki:
 * 一种交换顺序，基本思想是：两两比较相邻记录的关键字，如果反则交换，
 * 直到没有反序的记录为止
 */
public class MaoPaoSort {

    public static int[] bubbleSort(int[] array, int length) {
        if (array == null || length == 1) {
            return array;
        }
        boolean flag = true;                                    //标记上一趟是否交换了
        for (int m = 0; m < length && flag; m++) {
            for (int n = 0; n < length - m - 1; n++) {
                flag = false;
                if (array[n] > array[n + 1]) {
                    int temp = array[n];
                    array[n] = array[n + 1];
                    array[n + 1] = temp;
                    flag = true;                                //发生了交换
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int a[] = {3, 5, 7, 8, 8, 8, 10, 4454, 678, 10};
        int b[] = MaoPaoSort.bubbleSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}
