package com.mindhacks.ChapterFour;

import com.mindhacks.ArrayUtil;

import java.util.*;

/**
 * @Description: 滑动窗口，找出最大
 * @Author:mindHacks
 * @Date:2017年12月18日0:07
 * @wiki:
 */
public class SlideWindow {
    public static  int[] slide(int[] arr, int n, int w) {
        int[] res = new int[n - w + 1];
        for (int m = 0; m < res.length; m++) {
            res[m] = getMax(arr, m, m + w);
        }
        return res;
    }

    public static int getMax(int[] arr, int start, int end) {
        int max = arr[start];
        for (; start < end; start++) {
            if (arr[start] > max) {
                max = arr[start];
            }
        }
       return  max;
    }

    public static void main(String[] args) {
        int[] test=new int[]{4,3,2,1,5,10};
        int[] slideArray=slide(test,6,3);
        ArrayUtil.printAyyay(slideArray,slideArray.length);
    }
}