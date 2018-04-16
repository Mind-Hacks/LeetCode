package com.paixu;

/**
 * @Description: 堆排序
 * @Author:MindHacks
 * @Date:2018-04-16 11:00:24
 * @wiki:
 * （1）先利用数组构造，构造大根堆，
 * （2）然后去除堆顶元素，放入数组最后一个
 * （3）返回
 */
public class DuiSort {

    public static int[] selectionSort(int[] A, int n) {
        if (A == null || n == 0) {
            return null;
        }


        return A;
    }
    public static void main(String[] args) {
        int a[] = {54,35,48,36,27,12,44,44,8,14,26,17,28};
        int b[] = DuiSort.selectionSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}
