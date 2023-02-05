package com.AC.array;

/**
 * @author JiaDi Zhang
 * @LeetCode: 121. Best Time to Buy and Sell Stock
 * @Link:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * @date 2023/2/4
 */
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int sum = 0, max_profit = 0, subValue;
        for(int i = 0; i < prices.length - 1; i++ ) {
            subValue = prices[i + 1] - prices[i];
            sum += subValue;
            max_profit = Math.max(sum,max_profit);
            if(sum < 0) {
                sum = 0;
            }
        }
        return max_profit;
    }
}
