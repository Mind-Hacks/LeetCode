package com.mindhacks.ChapterSix;


public class MinValue {
    public int getMin(int[] arr, int n) {
        // write code here
        if (arr==null || n==0){
            return  -1;
        }

        int left=0;
        int right=n-1;
        int mid=0;
        while (left<right){
            if (left==right-1){
                break;
            }
            if (arr[left]<arr[right]){
                return  arr[left];
            }
            mid=(left+right)/2;
            if (arr[left]>arr[mid]){
                right=mid;
                continue;
            }
            if (arr[mid]>arr[right]){

            }
            int middle=left+(right-left)/2;
            if (left<=middle){
                right=middle-1;
            }

        }
        return 0;
    }
}