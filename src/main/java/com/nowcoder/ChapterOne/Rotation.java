package com.nowcoder.ChapterOne;
/**
 * 字符反转
 */

public class Rotation {
    public boolean chkRotation(String A, int lena, String B, int lenb) {
        if (lena != lenb) {
            return false;
        } else {
            String c= A + A;
            return c.contains(B);
        }
    }
}