package com.mindhacks.First.SingleNumber;

/**
 * @User MindHacks
 * @Date 2017/8/6 15:57
 * @Version 1.0.0
 */
public class TopSolution {
    public int singleNumber(int[] nums) {
        int r=0;
        int n=nums.length;
        for (int i=0;i!=n;++i)
            r=r^nums[i];
        return  r;
    }
}
