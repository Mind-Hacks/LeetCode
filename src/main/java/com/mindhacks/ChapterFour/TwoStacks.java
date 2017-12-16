package com.mindhacks.ChapterFour;

import java.util.ArrayList;

public class TwoStacks {
    public static int[] twoStacksSort(int[] numbers) {
        int point=0;
        getMax(numbers,point);
        twoStacksSort(numbers);
        return numbers;
    }

    public static  int[] getMax(int[] array, int point) {
        if (point == array.length - 1) {
            return array;
        } else {
            for (int m = point + 1; m < array.length; m++) {
                if (array[m] > array[point]) {
                    int temp = array[point];
                    array[point] = array[m];
                    array[m] = array[temp];
                }
            }
            return null;
        }
    }
}