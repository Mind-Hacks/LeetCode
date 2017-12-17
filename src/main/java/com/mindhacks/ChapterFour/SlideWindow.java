package com.mindhacks.ChapterFour;

import java.util.*;

/**
 * @Description: 滑动窗口，找出最大
 * @Author:mindHacks
 * @Date:2017年12月18日0:07
 * @wiki:
 */
public class SlideWindow {
    public int[] slide(int[] arr, int n, int w) {
        // write code here
        int[] res=new int[n-w+1];
        int index=0;
        for (int i = 0; i < n-w+1; i++) {
            res[index++]=getMax(arr,i,i+w-1);
        }
        return res;
    }

    public int getMax(int[] arr,int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}