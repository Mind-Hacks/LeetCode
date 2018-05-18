package com.offer;

import java.util.ArrayList;

/**
 * @Description: 输入一个字符串, 按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所，能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 * @Author:MindHacks
 * @Date:2018-04-23 10:05:36
 * @wiki:
 */
public class No28 {
    public ArrayList<String> Permutation(String str) {

        return null;
    }

    public  void  process(ArrayList arrayList,String str,int begin){

    }
    public void swap(char[] cs, int a, int b) {
        char temp = cs[a];
        cs[a] = cs[b];
        cs[b] = temp;
    }
}
