package com.joying.algorithm.interviewtest;

/**
 * 2020/3/27 面试算法题 2：
 * 给定一个数组，它的第 i 个元素是一只股票第 i 天的价格
 * 如果你最多只允许完成一笔交（既买入和卖出一只股票）
 * 设计一个算法来计算你所能获取的最大利润
 * 注意你不能在买入股票前卖出股票
 * 示例 1：
 * 输入：【7,1,5,3,6,4】
 * 输出： 5
 * 解释：在第 2 天（股票价格 = 1）的时候买入，在第5天（股票价格为 6）的时候卖出
 * 最大利润为 6 - 1 = 5。注意利润不能为 7 - 1 = 6，因为卖出价格要大于买入价格
 * 示例 2：
 * 输入：【7,6,4,3,1】
 * 输出： 0
 * 解释：在这种情况下，没有交易完成，所以最大利润为 0
 */
public class MaxProfit {
    /**
     * 暴力解法，采用两次遍历的形式
     * 时间复杂度O(n^2) 空间复杂度O(1)
     *
     * @param prices
     * @return
     */
    public static int maxProfit(int[] prices) {
        //先判断边界条件
        if (prices == null || prices.length <= 1) return 0;
        int maxP = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] - prices[i] > maxP)
                    maxP = prices[j] - prices[i];
            }
        }
        return maxP;
    }

    /**
     * 采用一次遍历法
     * 时间复杂度为O(n) 空间复杂度为O(1)
     * @param Prices
     */
    public static int maxProfit1(int[] Prices) {
        if (Prices == null || Prices.length <= 1) return 0;
        int maxP = 0;
        int minP = Prices[0];
        for (int i = 0; i < Prices.length; i++) {
            if (Prices[i] < minP) minP = Prices[i];
            if (Prices[i] - minP > maxP) maxP = Prices[i] - minP;
        }
        return maxP;
    }


    public static void main(String[] args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int[] prices1 = new int[]{7, 6, 4, 3, 1};
        int[] prices2 = new int[]{1};
        int[] prices3 = new int[]{1, 9};
        int[] prices4 = new int[]{7, 2, 1, 1, 2, 5, 5, 6, 7, 8};
        System.out.println("maxProfit(prices) = " + maxProfit(prices));
        System.out.println("maxProfit(prices1) = " + maxProfit(prices1));
        System.out.println("maxProfit(prices2) = " + maxProfit(prices2));
        System.out.println("maxProfit(prices3) = " + maxProfit(prices3));
        System.out.println("maxProfit1(prices) = " + maxProfit1(prices));
        System.out.println("maxProfit1(prices1) = " + maxProfit1(prices1));
        System.out.println("maxProfit1(prices2) = " + maxProfit1(prices2));
        System.out.println("maxProfit1(prices3) = " + maxProfit1(prices3));
    }
}
