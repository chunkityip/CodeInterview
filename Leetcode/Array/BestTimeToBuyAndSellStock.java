package Leetcode.Array;

public class BestTimeToBuyAndSellStock {

    /*
    One pointer to store the minPrice , another one is using loop to tearing thu length of prices
    minPrice will keep comparing , is index i of prices or minPrice


     */
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
