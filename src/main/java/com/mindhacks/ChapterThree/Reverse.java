package com.mindhacks.ChapterThree;

/**
 * 句子的逆序练习
 */
public class Reverse {
    public static String reverseSentence(String A, int n) {
        if (A == null || n == 0) {
            return A;
        }
        char[] s = A.toCharArray();
        rotateWord(s);
        return String.valueOf(s);
    }

    public static void rotateWord(char[] chas) {
        if (chas == null || chas.length == 0) {
            return;
        }
        reverse(chas, 0, chas.length - 1);
        int left = -1;
        int right = -1;
        for (int i = 0; i < chas.length; i++) {
            if (chas[i] != ' ') {
                left = (i == 0 || chas[i - 1] == ' ') ? i : left;
                right = (i == chas.length - 1 || chas[i + 1] == ' ') ? i : right;
            }
            if (left != -1 && right != -1) {
                reverse(chas, left, right);
                left = -1;
                right = -1;
            }
        }
    }

    public static void reverse(char[] chas, int start, int end) {
        char tmp = 0;
        while (start < end) {
            tmp = chas[start];
            chas[start] = chas[end];
            chas[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        String str = "abc def pf45";
        System.out.println(reverseSentence(str, str.length()));
    }
}