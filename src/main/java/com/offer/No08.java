package com.offer;


import java.util.Stack;

/**
 * @Description: 旋转数组的最小值
 * @Author:MindHacks
 * @Date:2018-04-05 17:40:54
 * @wiki:
 */
public class No08 {


    public static void main(String[] args) {

    }


    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        if (array[right] > array[left]) {
            return array[left];    //没有旋转、
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] == array[left] && array[left] == array[right]) {
                return seachMin(array, left, right);
            }
            if (right-left==1){
                break;
            }
            if (array[mid] >=array[left]) {
                left = mid + 1;
            } else if (array[mid] < array[right]) {
                right = mid - 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }

    private static int seachMin(int[] arr, int left, int right) {
        int result = arr[left];
        for (int i = left + 1; i <= right; ++i) {
            if (arr[i] < result)
                result = arr[i];
        }
        return result;
    }

}
