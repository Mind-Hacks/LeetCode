package com.nowcoder.Five.SellStockII;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by MindHacks on 2017/8/12.
 */
public class SellStockIITest {
    private static Logger logger = LoggerFactory.getLogger(SellStockIITest.class);

    public static void main(String[] args) {
        int[] a=new int[]{1,2,4};
        System.out.println(new SelfSolution().maxProfit(a));
    }
}
