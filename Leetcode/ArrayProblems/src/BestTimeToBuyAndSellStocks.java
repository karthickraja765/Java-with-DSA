public class BestTimeToBuyAndSellStocks {

    // Leetcode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    public int maxProfit(int[] prices) { // Brute force approach, But not passed!
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    if (prices[j] - prices[i] > maxProfit) {
                        maxProfit = prices[j] - prices[i];
                    }
                }
            }
        }
        return maxProfit;
    }

    public int maxProfitOptimal(int[] prices) { // optimal solution
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;  // update lowest buying price
            } else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;  // update best profit
                }
            }
        }
        return maxProfit;
    }
}
