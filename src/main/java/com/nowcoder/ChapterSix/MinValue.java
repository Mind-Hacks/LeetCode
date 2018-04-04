package com.nowcoder.ChapterSix;

/**
 * 对于一个有序循环数组arr，返回arr中的最小值。有序循环数组是指，有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。比如数组[1,2,3,3,4]，是有序循环数组，[4,1,2,3,3]也是。
 * <p>
 * 给定数组arr及它的大小n，请返回最小值。
 * <p>
 * 测试样例：
 * [4,1,2,3,3],5
 返回：1
    3 2 1 10 9 8
 */

/**
 * 对于一个循环有序数组a1,a2,…,an,存在一个i，
 * 满足1< i < n,使得a1,a2,…,ai和ai,ai+1,…,an同为单调不减，或单调不增数组。
 * 且a1,a2,…,ai中的任意一个元素恒大与等于或恒小于等于ai,ai+1,…,an中的任意一个元素。
 *
 *
 * 有序循环数组是指，
 * 有序数组左边任意长度的部分放到右边去，右边的部分拿到左边来。
 * 比如数组[1,2,3,3,4]，是有序循环数组
 */
public class MinValue {

    public static int getMin(int[] arr,int n) {
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
            if (arr[low] > arr[mid]) {
                high = mid;
                continue;
            }
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


    public static void main(String[] args) {
        int[] testArray = new int[]{4,1,2,3,3};
        int  result=getMin(testArray,testArray.length);
        System.out.println("结果="+result);
    }
}