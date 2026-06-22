class Solution {
    public int maxProfit(int[] prices) {
        
        int minP = Integer.MAX_VALUE;

        int maxProfit = 0;

        for(int price : prices) {

            minP = Math.min(price, minP);

            maxProfit = Math.max(maxProfit, price - minP);

        }

        return maxProfit;

    }
}
