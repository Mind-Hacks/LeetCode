package com.offer;


/**
 * @Description: 打印1到最大的n位数字
 * @Author:MindHacks
 * @Date:2018-04-08 19:21:11
 * @wiki:
 */
public class No12 {

    private  static  int total=0;

    public static void main(String[] args) {
        printDigits(2);
    }
    public static void printDigits(int n) {
        // 输入的数字不能为小于1
        if (n < 1) {
           return;
        }
        // 创建一个数组用于打存放值
        int[] arr = new int[n];
        printOneToNthDigits(0, arr);
    }

    public static void printOneToNthDigits(int n, int[] arr) {
        System.out.println("total===="+total);
        // 说明所有的数据排列选择已经处理完了
        if (n >= arr.length) {
            // 可以输入数组的值
            printArray(arr);
        } else {
            // 对
            for (int i = 0; i <= 9; i++) {
                arr[n] = i;
                printOneToNthDigits(n + 1, arr);
            }
        }
    }

    public static void printArray(int[] arr) {
        // 找第一个非0的元素
        int index = 0;
        while (index < arr.length && arr[index] == 0) {
            index++;
        }
        // 从第一个非0值到开始输出到最后的元素。
        for (int i = index; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        // 条件成立说明数组中有非零元素，所以需要换行
        if (index < arr.length) {
            System.out.println();
        }
    }
}
