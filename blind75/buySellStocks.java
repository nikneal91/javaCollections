package blind75;
public class buySellStocks {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4,9};
        int result = maxProfit(prices);
        System.out.println("Maximum profit is : " + result);
    }

    private static int maxProfit(int[] prices) {
       int maxProfit = 0;
       int profit =0;
       int minPrice=prices[0];
       for (int i=1;i<prices.length;i++) {
        profit = prices[i]-minPrice;
        maxProfit = Math.max(maxProfit, profit);
        minPrice=Math.min(minPrice,prices[i]);
       }
       return maxProfit;
    }
}
