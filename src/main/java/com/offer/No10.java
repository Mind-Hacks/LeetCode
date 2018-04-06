package com.offer;


/**
 * @Description: 二进制中1的个数
 * @Author:MindHacks
 * @Date:2018-04-05 19:01:12
 * @wiki:
 */
public class No10 {


    public static void main(String[] args) {
    }

    public int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if ((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return  count;
    }
}
