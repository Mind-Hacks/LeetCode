package com.offer;


import com.nowcoder.ListNode;

/**
 * @Description: 调整数组顺序，使奇数位于偶数前面
 * @Author:MindHacks
 * @Date:2018-04-08 21:38:46
 * @wiki:
 */
public class No14 {

    public static void main(String[] args) {

    }

    public void reOrderArray(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            if (tmp % 2 == 1) {
                for (int j = i; j > 0; j--) {
                    if (array[j - 1] % 2 == 0) {
                        int t = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = t;
                    }
                }
            }
        }
    }

}
