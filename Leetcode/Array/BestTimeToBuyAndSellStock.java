package Leetcode.Array;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minBuy) {
                minBuy = prices[i];
            } else if (prices[i] - minBuy > maxProfit) {
                maxProfit = prices[i] - minBuy;
            }
        }
        return maxProfit;
    }
}
