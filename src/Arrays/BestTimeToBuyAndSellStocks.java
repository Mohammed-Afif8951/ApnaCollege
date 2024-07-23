package Arrays;

public class BestTimeToBuyAndSellStocks {

    public static int buyAndSellStocks(int sellPrices[]){
        int maxProfit = 0;
        int boughtPrice = Integer.MAX_VALUE;
        for(int i=0; i<sellPrices.length; i++){
            if(boughtPrice<sellPrices[i]){ //if their is a profit
                int profit = sellPrices[i] - boughtPrice; //calculate profit for current day
                maxProfit = Math.max(maxProfit, profit); //calculate maxprofit
            }else{
                boughtPrice = sellPrices[i]; // if stock is availale at lower price
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4,11};
        System.out.println(buyAndSellStocks(price));
    }
}
