package com.offer;


/**
 * @Description: 数值的整数次方
 * @Author:MindHacks
 * @Date:2018-04-06 14:39:41
 * @wiki: 利用a的n次方公式
 */
public class No11 {


    public static void main(String[] args) {
    }

    public static double Power(double base, int exponent) {
        int n=Math.abs(exponent);
        if (n==0){
            return  1;
        }
        if (n==1){
            return  base;
        }
        double result=Power(base,n>>1);
        result *=result;
        if ((n&0x1)==1){
            result *=base;
        }
        if(exponent<0)
            result=1/result;
        return result;
    }

}
