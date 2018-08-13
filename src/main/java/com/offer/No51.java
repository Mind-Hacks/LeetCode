package com.offer;

import java.util.HashMap;

/**
 * @Description: 数组中重复数字问题
 * @Author:MindHacks
 * @Date:2018-04-04 12:00:36
 * @wiki:
 */
public class No51 {
    public static void main(String[] args) {
        int[] numbers1 = {2, 1, 3, 1, 4};
        int[] test=new int[numbers1.length];
        duplicate(numbers1,5,test);
        System.out.println(test[0]);

        HashMap hashMap=new HashMap();
        hashMap.put("11","11");

      /*  int[] numbers2 = {2, 4, 3, 1, 4};
        System.out.println(duplicate(numbers2));

        int[] numbers3 = {2, 4, 2, 1, 4};
        System.out.println(duplicate(numbers3));

        int[] numbers4 = {2, 1, 3, 0, 4};
        System.out.println(duplicate(numbers4));

        int[] numbers5 = {2, 1, 3, 5, 4};
        System.out.println(duplicate(numbers5));*/
    }

    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length < 2) {
            duplication[0] = -1;
            return false;
        }
        for (int n = 0; n < numbers.length; n++) {
            while (n != numbers[n]) {
                if (numbers[n] == numbers[numbers[n]]) {
                    duplication[0] = numbers[n];
                    return true;
                } else {//交换值  num[n] /num[num[n]]
                    int temp = numbers[n];
                    numbers[n] = numbers[temp];
                    numbers[temp] = temp;
                }
            }
        }
        return false;
    }


}
