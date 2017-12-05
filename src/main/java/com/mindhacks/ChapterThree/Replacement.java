package com.mindhacks.ChapterThree;

/**
 * @description :字符串替换
 * @user MindHacks
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iniString.length(); i++) {
            if (iniString.charAt(i) == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(iniString.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}