package com.offer;

import java.util.ArrayList;

/**
 * @Description:输入n个整数，找出其中最小的K个数。 例如输入4, 5, 1, 6, 2, 7, 3, 8这8个数字，则最小的4个数字是1,2,3,4,。
 * @Author:MindHacks
 * @Date:2018-08-15 22:58:15
 * @wiki: 构建最大堆
 */
public class No30 {

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (input == null || input.length == 0 || input.length < k) {
            return list;
        }
        for (int len = k / 2; len >= 0; len--) {

        }
        return null;
    }

    public void adjustMaxHeapSort(int[] input, int pos, int length) {
        int temp;
        int child;
        for (temp = input[pos]; 2 * pos + 1 <= length; pos = child) {
            child = 2 * pos + 1;
            if (child < length && input[child] < input[child + 1]) {
                child++;
            }
        }
    }
}
