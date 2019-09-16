package com.offer;

/**
 * 出现一次的词字符
 */
public class No35 {

    public static String getFirstChar(String str){
        if (str==null || "".equals(str)){
            return "-1";
        }
        int[] hastTable=new int[256];
        char[] charArray=str.toCharArray();
        for (int n=0;n<charArray.length;n++){
            hastTable[(int)charArray[n]]+=1;
        }
        for (int n=0;n<charArray.length;n++){
            if (hastTable[(int)charArray[n]]==1){
                return String.valueOf(charArray[n]);
            }
        }
        return  "-1";
    }

    public static void main(String[] args) {
        System.out.println(getFirstChar("111"));
    }

}

