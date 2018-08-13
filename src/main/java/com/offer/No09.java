package com.offer;


/**
 * @Description: 斐波那契数列
 * @Author:MindHacks
 * @Date:2018-04-05 18:41:30
 * @wiki:
 */
public class No09 {


    public static void main(String[] args) {

    }

    public int Fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int preFibonacci = 1;
        int prePreFibonacci = 0;
        int result = 0;
        for (int m = 2; m <= n; m++) {
            result = preFibonacci + prePreFibonacci;
            prePreFibonacci = preFibonacci;
            preFibonacci = result;
        }
        return result;
    }

}
