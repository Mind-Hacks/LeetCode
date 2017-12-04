package com.mindhacks.ChapterThree;
/**
     * @description :字符串位位移
     * @user MindHacks
  */
public class Translation {
    public static String stringTranslation(String A, int n, int len) {
        // write code here
        if (len == 0) {
            return A;
        }
        char[] chars = A.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars, 0, n - len - 1);
        reverse(chars, n - len, n-1);
        return String.valueOf(chars);
    }


    public static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str1 = "RJXJYA";
        String rever = stringTranslation(str1, 6, 1);
        System.out.println(rever);
    }
}