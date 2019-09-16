package com.offer;

/**
 * @Description: 从1到n整数中1出现的次数
 * @Author:MindHacks
 * @Date:2019-08-13 09:15:42
 * @wiki:
 */
public class No32 {
    //base method
    static int NumTotal1(int n) {
        if (n <= 0) {
            return 0;
        }
        int total = 0;
        for (int m = 1; m <= n; m++) {
            if (m % 10 == 1) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(NumTotal1(21));
    }
}
