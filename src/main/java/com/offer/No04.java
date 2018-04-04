package com.offer;

/**
 * @Description: 替换空格
 * @Author:MindHacks
 * @Date:2018-04-04 16:00:28
 * @wiki:
 */
public class No04 {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("We are happy");
        System.out.println(replaceSpace(stringBuffer));
    }


    public static String replaceSpace(StringBuffer str) {
        if (str == null || str.toString().length() == 0) {
            return "";
        }
        String originStr = str.toString();
        Integer originLength = originStr.length();
        Integer changeLength = originLength;
        char[] chars = originStr.toCharArray();
        for (int n = 0; n < originLength; n++) {
            if (chars[n] == ' ') {
                changeLength = changeLength + 2;
            }
        }
        if (originLength.equals(changeLength)) {
            return originStr;
        }
        char[] changeChars = new char[changeLength];
        int j = changeLength - 1;
        int i = originLength - 1;
        while (i >= 0) {
            if (chars[i] == ' ') {
                changeChars[j] = '0';
                changeChars[j - 1] = '2';
                changeChars[j - 2] = '%';
                j=j-3;
            } else {
                changeChars[j] = chars[i];
                j--;
            }
            i--;
        }
        return new String(changeChars);
    }
}
