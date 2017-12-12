package com.mindhacks.ChapterThree;

/**
 * @Description:返回字符串最长无重复长度
 * @Author:mindHacks
 * @Date:2017年12月13日1:39
 * @wiki:
 */
public class DistinctSubstring {

    public static int longestSubstring(String A, int n) {
        if (A == null || n == 0) {
            return 0;
        }
        char[] chars = A.toCharArray();
        int[] maps = new int[256];        //目的是记录下每个每个字符串，之前出现的位置
        for (int m = 0; m < maps.length; m++) {
            maps[m] = -1;
        }
        int pre = -1;
        int length = 0;
        int cur = 0;
        for (int m = 0; m < chars.length; m++) {
            pre = Math.max(pre, maps[chars[m]]);
            cur = m - pre;
            length = Math.max(cur, length);
            maps[chars[m]] = m;
        }
        return length;
    }

    public static void main(String[] args) {
        String testStr="ABCCECFT";
        System.out.println(longestSubstring(testStr,testStr.length()));
    }
}