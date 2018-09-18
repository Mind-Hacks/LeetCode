package com.offer;

/**
 * @Description: 连续字数组最大和。动态规划的思想
 * @Author:MindHacks
 * @Date:2018-09-18 23:12:17
 * @wiki:
 */
public class No31 {

    int MaxSubSum(int arr[], int len) {
        int i;
        int MaxSum = 0;
        int ThisSum = 0;
        for (i = 0; i < len; i++) {
            ThisSum += arr[i];
            if (ThisSum > MaxSum)
                MaxSum = ThisSum;
        /*如果累加和出现小于0的情况，
           则和最大的子序列肯定不可能包含前面的元素，
           这时将累加和置0，从下个元素重新开始累加  */
            else if (ThisSum < 0)
                ThisSum = 0;
        }
        return MaxSum;
    }
}
