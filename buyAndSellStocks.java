class Solution {
    public int maxProfit(int[] prices) {
        // create max profit variable
        int maxProfit = 0;
        
        // iterate through array starting at day 1
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i-1]) {
                maxProfit += prices[i] - prices[i-1];
            }
        }
        
        return maxProfit;
    }
}