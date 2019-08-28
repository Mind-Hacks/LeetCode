package com.offer;

/**
 * 寻找丑数
 */
public class No34 {

    public boolean uglyNum1(int num) {
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return (num == 1) ? true : false;
    }

    public int method1(int index) {
        if (index <= 0) {
            return 0;
        }
        int point = 0;
        int currentNum = 0;
        while (point < index) {
            currentNum++;
            if (uglyNum1(currentNum)) {
                point++;
            }
        }
        return currentNum;
    }
}
