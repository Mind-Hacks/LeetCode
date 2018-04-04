package com.nowcoder.ChapterTwo;

public class ShellSort {

    public int[] shellSort(int[] A, int n) {
        // write code here

        if (A == null || n < 2)
            return A;

        int feet = n / 2;
        int index = 0;
        while (feet > 0) {
            for (int i = feet; i < n; i++) {        //步长是最小的循环单位，所以是从步长开始
                index = i;
                while (index >= feet) {
                    if (A[index - feet] > A[index]) {
                        swap(A, index - feet, index);
                        index -= feet;
                    } else {
                        break;
                    }
                }
            }
            feet = feet / 2;
        }
        return A;
    }

    void swap(int[] A, int m, int n) {
        int temp = A[m];
        A[m] = A[n];
        A[n] = temp;
    }


    public static void main(String[] args) {
        int[] A = new int[]{7, 4, 10, 11, 111, 222, 45, 66, 27};
        int[] B = new ShellSort().shellSort(A, A.length);
        for (int n = 0; n < B.length; n++) {
            System.out.print(B[n] + " ");
        }
    }
}