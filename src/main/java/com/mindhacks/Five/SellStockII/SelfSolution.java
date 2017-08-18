package com.mindhacks.Five.SellStockII;

public class SelfSolution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int n = 0; n < prices.length - 1; n++) {
            if (prices[n] < prices[n + 1]) {
                result += prices[n + 1] - prices[n];
            }
        }
        return result;
    }
}