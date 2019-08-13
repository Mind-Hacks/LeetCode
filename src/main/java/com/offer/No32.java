package com.offer;

/**
 * @Description: 从1到n整数中1出现的次数
 * @Author:MindHacks
 * @Date:2019-08-13 09:15:42
 * @wiki:
 */
public class No32 {
    //base method
    int NumTotal1(int n){
        if (n<=0){
            return 0;
        }
        int total=0;
        while (n/10!=0){
            if (n%10==1){
                total++;
            }
        }
        return  total;
    }
}
