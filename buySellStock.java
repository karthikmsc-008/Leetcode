class Solution {
    public int maxProfit(int[] prices) {
        int minprofit=prices[0];
        int maxProfit=0;
        for(int i=0;i<prices.length;i++)
        {
            minprofit=Math.min(prices[i], minprofit); //Find the minimum element in that array
          
            int profit=prices[i]-minprofit;
            
            maxProfit=Math.max(maxProfit, profit);   //Max profti element in that array
        }
        return maxProfit;
    }
}
