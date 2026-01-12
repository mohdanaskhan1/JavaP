package com.DSAHighFrequency;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int profit = 0;
        //bruteforce approach - O(n^2)

//        for (int i=0; i<prices.length; i++){
//            for (int j=i; j<prices.length; j++){
//                int profit1 = prices[j]-prices[i];
//                if (profit < profit1){
//                    profit = profit1;
//                }
//            }
//        }

        //Optimized Approach - O(n)
//        int buy = prices[0];
//        if (prices == null || prices.length < 2) return 0;
//        for(int i=0; i<prices.length; i++){
//            profit = Math.max(profit, prices[i]-buy);
//            buy = Math.min(buy,prices[i]);
//        }
//        return profit;
        
        //Simple Approach - O(n)
        int buy = prices[0];
        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else if (price - buy > profit) {
                profit = price - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,1,2};
        System.out.println(maxProfit(prices));
    }
}
