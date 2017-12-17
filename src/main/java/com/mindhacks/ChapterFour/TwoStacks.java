package com.mindhacks.ChapterFour;

import java.util.ArrayList;

public class TwoStacks {

    public static ArrayList<Integer> twoStacksSort(int[] numbers) {
        int len = numbers.length;
        int[] help = new int[len];
        int n = len - 1;
        int m = -1;
        while (n >= 0) {
            int key = numbers[n--];
            if (m == -1) {
                help[++m] = key;
            } else {
                if (help[m] > key) {
                    help[++m] = key;
                } else {
                    int k = m;
                    while (k >= 0 && help[k] <= key) {
                        help[k + 1] = help[k];
                        k--;
                    }
                    help[k + 1] = key;
                    m++;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < help.length; i++) {
            list.add(help[i]);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 4, 5};
        ArrayList<Integer> arrayList = twoStacksSort(test);
        for (Integer array : arrayList) {
            System.out.print(array);
        }
    }
}