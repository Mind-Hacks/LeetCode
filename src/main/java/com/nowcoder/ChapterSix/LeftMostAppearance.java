package com.nowcoder.ChapterSix;

/**
 * 对于一个有序数组arr，再给定一个整数num，请在arr中找到num这个数出现的最左边的位置。
 * 给定一个数组arr及它的大小n，同时给定num。
 * 请返回所求位置。若该元素在数组中未出现，请返回-1。
 */
public class LeftMostAppearance {
    public static int findPos(int[] arr, int n, int num) {
        if (arr == null || n == 0) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] < num) {
                left = middle + 1;
            } else if (arr[middle] > num) {
                right = middle - 1;
            } else {
                result = middle;
                right = middle - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] testArray = new int[]{36, 62, 146, 208, 210, 369, 616};
        int result = findPos(testArray, testArray.length, 616);
        System.out.println(result);
    }
}
