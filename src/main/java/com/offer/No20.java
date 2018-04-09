package com.offer;


import java.util.ArrayList;

/**
 * @Description: 顺时针打印矩阵
 * @Author:MindHacks
 * @Date:2018-04-09 21:36:12
 * @wiki: 思想， 用左上和右下的坐标定位出一次要旋转打印的数据，一次旋转打印结束后，
 * 往对角分别前进和后退一个单位。
 *
 * 这一道题的边界问题比较复杂
 */
public class No20 {

    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        ArrayList res = new ArrayList();
        if (row == 0 || col == 0) {
            return res;
        }
        int left = 0, top = 0, right = col - 1, bottom = row - 1;  //定义关键变量，表示左上 和右下的的打印范围

        while (left <= right && top <= bottom) {
            // left to right
            for (int i = left; i <=right; ++i) {
                res.add(matrix[top][i]);
            }
            // top to bottom
            for (int i = top + 1; i <= bottom; ++i) {
                res.add(matrix[i][right]);
            }
            //right to left
            if (top != bottom)
                for (int i = right - 1; i >= left; --i) {
                    res.add(matrix[bottom][i]);
                }

            //bottom  to top
            if (left != right) {
                for (int i = bottom - 1; i >top; --i) {
                    res.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return res;
    }
}
