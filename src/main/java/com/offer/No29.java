package com.offer;

import java.util.ArrayList;

/**
 * @Description: 输入一个字符串, 按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所，能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 * @Author:MindHacks
 * @Date:2018-04-23 10:05:36
 * @wiki:
 */
public class No29 {

    public static int moreThanHalfnum(int[] nums, int length) {
        int result = nums[0];
        int time = 1;
        for (int i = 0; i < length; i++) {
            if (0 == time) {
                result = nums[i];
            } else if (nums[i] == result) {
                time++;
            } else {
                time--;
            }
        }
        return result;
    }
}
