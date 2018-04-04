package com.nowcoder.ChapterTwo;

import com.nowcoder.ArrayUtil;

/**
 * Created by MindHacks on 2017/10/11.
 * 数组排序
 */
public class CountingSort {
    public int[] countingSort(int[] A, int n) {
        for (int m = 0; m < n; m++) {
            for (int point = m; point < n; point++) {
                if (A[m] > A[point]) {
                    ArrayUtil.changeValue(A, m, point);
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[]{54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28};
        int[] B = new CountingSort().countingSort(A, A.length);
        for (int n = 0; n < B.length; n++) {
            System.out.print(B[n] + " ");
        }
    }
}
