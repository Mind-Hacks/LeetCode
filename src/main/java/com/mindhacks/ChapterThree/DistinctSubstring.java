package com.mindhacks.ChapterThree;

/**
 * @description :返回字符串最长无重复长度
 * @user MindHacks
 */
public class DistinctSubstring {
        public static int longestSubstring(String A, int n) {
            if (A == null || n == 0) {
                return 0;
            }
            char[] chas = A.toCharArray();
            int[] map = new int[256];
            for (int i = 0; i < 256; i++) {
                map[i] = -1;
            }
            int len = 0;
            int pre = -1;
            int cur = 0;
            for (int i = 0; i < n; i++) {
                pre = Math.max(pre, map[chas[i]]);
                cur = i - pre;
                len = Math.max(len, cur);
                map[chas[i]] = i;
            }
            return len;
        }

    public static void main(String[] args) {
        String testStr="aabcb";
        System.out.println(longestSubstring(testStr,5));
    }
}