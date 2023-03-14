package org.example;

public class ProfitFinder {
    public int calcMaxProfit(int[] prices) {
        int minPriceIndex = 0;
        int maxPriceIndex = 1;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prices[minPriceIndex]) minPriceIndex = i;
            if (i == 0) continue;
            if (prices[i] > prices[maxPriceIndex]) maxPriceIndex = i;
        }

        if (maxPriceIndex <= minPriceIndex) return 0;
        else return prices[maxPriceIndex] - prices[minPriceIndex];
    }
}
