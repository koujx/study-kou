package com.problems.leetCode;

/**
 * Created by koujx on 2016/4/25.
 * #121. Best Time to Buy and Sell Stock   My Submissions QuestionEditorial Solution
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
 * design an algorithm to find the maximum profit.
 * <p/>
 * #122. Best Time to Buy and Sell Stock II
 * Say you have an array for which the ith element is the price of a given stock on day i.
 * Design an algorithm to find the maximum profit.
 * You may complete as many transactions as you like (ie, buy one and sell one share of the stock multiple times).
 * However, you may not engage in multiple transactions at the same time (ie, you must sell the stock before you buy again).
 *
 *
 */
public class BestTimetoBuyandSellStock {

    /**
     * #121. Best Time to Buy and Sell Stock
     * 动态规划法
     * 从前向后遍历数组，记录当前出现过的最低价格，作为买入价格，并计算以当天价格出售的收益，作为可能的最大收益，
     * 整个遍历过程中，出现过的最大收益就是所求。
     */
    public int maxProfit1(int[] prices) {
        if (prices.length < 2) return 0;

        int maxProfit = 0;
        int curMin = prices[0];

        for (int i = 1; i < prices.length; i++) {
            curMin = Math.min(curMin, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - curMin);
        }

        return maxProfit;
    }
   /*时间开销巨大。。。
   public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;
        else return maxProfit(prices, 0);
    }
    public int maxProfit(int[] prices, int index) {
        int min = prices[index];
        int max = prices[index];
        int profit = max - min;
        for (int i = index + 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                profit = max - min;
            } else if (prices[i] < min) {
                for (int j = i; j < prices.length - 1; j++) {
                    if (prices[j] >= prices[j + 1]) continue;
                    else {
                        profit = Math.max(profit, maxProfit(prices, j));
                        return profit;
                    }
                }
            } else {
                continue;
            }
        }
        return profit;
    }*/

    /**
     * #122. Best Time to Buy and Sell Stock II
     * 贪心法.
     * 从前向后遍历数组，只要当天的价格高于前一天的价格，就算入收益。
     * */
    public int maxProfit2(int[] prices) {
        if (prices.length < 2) return 0;

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) {
                maxProfit += diff;
            }
        }
        return maxProfit;
    }
}