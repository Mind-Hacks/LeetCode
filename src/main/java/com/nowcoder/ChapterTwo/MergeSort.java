package com.nowcoder.ChapterTwo;

/**
 * 归并排序：可以画成树，然后取值
 */
public class MergeSort {
    public int[] mergeSort(int[] A, int n) {
        if (A == null || n == 0) {
            return null;
        }
        merge(A, 0, A.length - 1);
        return A;
    }

    public void merge(int[] A, int left, int right) {
        if (left == right) {
            return;
        }
        int middle = (left + right) / 2;
        merge(A, left, middle);
        merge(A, middle + 1, right);
        compare(A, left, middle, right);
    }

    public void compare(int[] A, int left, int middle, int right) {
        int[] tempArray = new int[right - left + 1];
        int l = left;
        int r = middle+1;                                           //从middle开始，还是有些小问题
        int index = 0;
        while (l <= middle && r <= right) {
            if (A[l] < A[r]) {
                tempArray[index++] = A[l++];
            } else {
                tempArray[index++] = A[r++];
            }
        }

        while (l <= middle) {
            tempArray[index++] = A[l++];
        }
        while (r<=right) {
            tempArray[index++] = A[r++];
        }
        for (int n = 0; n < tempArray.length; n++) {
            A[left+n] = tempArray[n];
        }
    }


    public static void main(String[] args) {
        int[] A = new int[]{7, 4, 10, 11, 111, 222, 45, 66, 27};
        int[] B = new MergeSort().mergeSort(A, A.length);
        for (int n=0;n<B.length;n++){
            System.out.print(B[n]+" ");
        }
    }
}