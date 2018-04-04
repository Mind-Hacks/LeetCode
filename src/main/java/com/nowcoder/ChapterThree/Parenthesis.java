package com.nowcoder.ChapterThree;

/**
     * @description :符号串对比
     * @user MindHacks
  */
public class Parenthesis {
    public   boolean chkParenthesis(String A, int n) {
        char[] charList = A.toCharArray();
        int point = 0;
        for (int m = 0; m < charList.length; m++) {
            if (charList[m] == '(') {
                point++;
            }
            if (charList[m] == ')') {
                point--;
            }
        }
        if (point == 0) {
            return true;
        } else {
            return false;
        }
    }

}