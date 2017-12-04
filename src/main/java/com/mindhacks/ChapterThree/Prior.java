package com.mindhacks.ChapterThree;

import java.util.*;

public class Prior {

    public String findSmallest(String[] strs, int n) {
        if (strs == null || n == 0) {
            return "";
        }
        // 根据新的比较方式排序
        Arrays.sort(strs, new MyCompare());
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(strs[i]);
        }
        return stringBuffer.toString();
    }


    class MyCompare implements Comparator<String> {
        public int compare(String str1, String str2) {
            return (str1 + str2).compareTo(str2 + str1);
        }
    }


}