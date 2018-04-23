package com.offer;


public class No08 {


    public static void main(String[] args) {

    }


    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (array[left] >= array[right]) {
            if ((right - left) == 1) {
                mid = right;
                break;
            }
            mid = (right + left) / 2;
            if (array[left] == array[mid] && array[mid] == array[right]) {
                return seachMin(array, left, right);
            }
            if (array[left] <= array[mid]) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return array[mid];
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
