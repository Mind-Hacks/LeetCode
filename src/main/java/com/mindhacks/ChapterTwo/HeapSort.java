package com.mindhacks.ChapterTwo;

public class HeapSort {
    public int[] heapSort(int[] A, int n) {
        buildHeap(A, n);
        for (int i = n - 1; i >= 0; i--) {
            swap(A, 0, i);
            adjustHeap(A, 0, i);
        }
        return A;
    }
     
    public void buildHeap(int[] A, int length) {
        for (int i = length / 2; i >= 0; i--) {
            adjustHeap(A, i, length);
        }
    }
     
    public void adjustHeap(int[] A, int index, int length) {
        int temp = A[index];
        for(int j = 2 * index + 1; j < length; j = j * 2 + 1) {
            if(j < length - 1 && A[j] < A[j+1]){
                j++;
            }
            if(temp > A[j]) {
                break;
            }
            A[index] = A[j];
            index = j;
        }
        A[index] = temp;
    }
     
    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }


    public static void main(String[] args) {
        int a[] = {3, 5, 7, 8, 8, 8, 10, 4454, 678, 10};
        int b[] = new HeapSort().heapSort(a, a.length);
        for (int n = 0; n < b.length; n++) {
            System.out.print(b[n] + ",");
        }
    }
}