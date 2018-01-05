package com.mindhacks.ChapterSix;

/**
 * 对于一个有序循环数组arr，返回arr中的最小值。有序循环数组是指，有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。
 * <p>
 * 给定数组arr及它的大小n，请返回最小值。
 * <p>
 * 测试样例：
 * [4,1,2,3,3],5
 */
public class MinValue {

    public int getMin(int[] arr, int n) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;

        while (low < high) {
            if (low == high - 1) {
                break;
            }
            if (arr[low] < arr[high]) {
                return arr[low];
            }
            mid = (low + high) / 2;


            //5  1 2 4
            if (arr[low] > arr[mid]) {
                high = mid;
                continue;
            }

            //5 6 7 8 9 10 1 4
            if (arr[mid] > arr[high]) {
                low = mid;
                continue;
            }
            while (low < mid) {
                if (arr[low] == arr[mid]) {
                    low++;
                } else if (arr[low] < arr[mid]) {
                    return arr[low];
                } else {
                    high = mid;
                    break;
                }
            }
        }
        return Math.min(arr[low], arr[high]);
    }
}