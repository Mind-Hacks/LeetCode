package com.mindhacks.ChapterSix;


public class MinValue {
    public int getMin(int[] arr, int n) {
        // write code here
        if (arr==null || n==0){
            return  -1;
        }
        int left=0;
        int right=n-1;
        while (left<=right){
            int middle=left+(right-left)/2;
            if (left<=middle){
                right=middle-1;
            }

        }
        return 0;
    }
}