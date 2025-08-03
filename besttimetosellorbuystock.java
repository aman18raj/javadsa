public class besttimetosellorbuystock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 8, 4};
        int maxProfit = 0;
        int lowestPrice = prices[0];
        for(int i=1; i<prices.length; i++){
            if(prices[i] > lowestPrice){
                int profit = prices[i] - lowestPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
            lowestPrice = Math.min(lowestPrice, prices[i]);
        }
        System.out.println("Maximum profit: " + maxProfit);
        
    }
}
