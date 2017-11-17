package com.mindhacks.ChapterThree;

/**
 * 利用木桶思想，进行判断
 */
public class Transform {
    public static boolean chkTransform(String A, int lena, String B, int lenb) {
        if(A == null || B == null || lena != lenb){
            return false;
        }
        char[] chas1 = A.toCharArray();
        char[] chas2 = B.toCharArray();
        int[] map = new int[256];
        for(int i = 0; i < chas1.length; i++){
            int temp=chas1[i];
            map[temp]++;
        }
        for(int i = 0; i < chas2.length; i++){
            int temp=chas2[i];
            if(map[temp]-- == 0){
                return false;
            }
        }
        return  true;
    }

}