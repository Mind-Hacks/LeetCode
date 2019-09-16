package com.offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 输入一个正整数数组，
 * 把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个
 */
public class No33 {

    public void findMakeUpNum(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        Integer[] pageIntegers = new Integer[array.length];
        for (int n = 0; n < array.length; n++) {
            pageIntegers[n] = array[n];
        }
        Arrays.sort(pageIntegers, new Comparator<Integer>() {
            //对数组numbers用自定义方法排序
            public int compare(Integer o1, Integer o2) {
                //重写compare方法来比较o1,o2的大小，当o1+""+o2和o2+""+o1
                //都是字符串，比较o1,o2的大小其实是比较两个子串的大小
                return (o1 + "" + o2).compareTo(o2 + "" + o1);
            }

        });
        String ss = new String();
        for (int i = 0; i < pageIntegers.length; i++) {
            ss += pageIntegers[i];
        }
        System.out.println(ss);
    }


}
