package com.offer;

/**
 * @Description: 二维数组查找问题
 * @Author:MindHacks
 * @Date:2018-04-04 10:39:28
 * @wiki:
 */
public class No03 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 8, 9},
                {2, 4, 9, 12},
                {4, 7, 10, 13},
                {6, 8, 11, 15}
        };

        System.out.println(search(arr, 7));
    }

    private static boolean search(int[][] array, int value) {
        int x = 0;
        int y = array[0].length - 1;
        while (x <= array.length - 1 && y >= 0) {
            if (array[x][y] == value) {
                return true;
            }
            if (array[x][y] > value) {
                y--;
            } else {
                x++;
            }
        }
        return false;
    }
}
