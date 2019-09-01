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

    public int method2(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] arrays = new int[n];
        arrays[0] = 1;
        int multiply2 = 0;
        int multiply3 = 0;
        int multiply5 = 0;
        for (int i = 1; i < n; i++) {
            int min = min(arrays[multiply2] * 2, arrays[multiply3] * 3, arrays[multiply5] * 5);
            arrays[i] = min;
            while (arrays[multiply2] * 2 == arrays[i]) {
                multiply2++;
            }
            while (arrays[multiply3] * 3 == arrays[i]) {
                multiply3++;
            }
            while (arrays[multiply5] * 5 == arrays[i]) {
                multiply5++;
            }
        }
        return arrays[n-1];
    }


    public int min(int number1, int number2, int number3) {
        int min = (number1 < number2) ? number1 : number2;
        return min < number3 ? min : number3;
    }

    public static void main(String[] args) {
        No34 no34 = new No34();
        //System.out.println(no34.method1(1500));
        System.out.println(no34.method2(1500));
    }


}
