package com.chazhao;

/**
 * @Description: 二分查找算法
 * @Author:MindHacks
 * @Date:2018-04-18 21:45:37
 * @wiki:
 */
public class BinarySearch {

    public static int searchRecursive(int[] array, int start, int end, int findValue) {
        // 如果数组为空，直接返回-1，即查找失败
        if (array == null) {
            return -1;
        }

        if (start <= end) {
            // 中间位置
            int middle = (start + end) / 2;
            // 中值
            int middleValue = array[middle];

            if (findValue == middleValue) {
                // 等于中值直接返回
                return middle;
            } else if (findValue < middleValue) {
                // 小于中值时在中值前面找
                return searchRecursive(array, start, middle - 1, findValue);
            } else {
                // 大于中值在中值后面找
                return searchRecursive(array, middle + 1, end, findValue);
            }
        } else {
            // 返回-1，即查找失败
            return -1;
        }
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(searchRecursive(array, 0, array.length - 1, 9));
    }

}
