/* You  are  given  an  array prices where prices[i] is  the  price  of  a  given  stock  on  the ith day.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, 
return 0 .
*/


/*Example 1:Input:prices = [7, 1, 5, 3, 6,  4] 
  Output:   5 
  Explanation:  Buy on day 2 (price = 1) 
                and sell on day 5 (price = 6), profit = 6-1 = 5.
                Note that buying on day 2 and selling on day 1 is not allowed because 
                you must buy before you sell.


Example 2:Input:Prices = [7, 6, 4,  3, 1]  
Output:   0 
Explanation:   In this case, no transactions are done and the max profit = 0.

Constraints:
•1 <= prices.length <= 105
•0<= prices [i] <= 104
 */
package Arrays.Assignment;

// public class BuyAndSellStocks {

//     public static int buyAndSellStocks(int arr[]){
//         int maxProfit = Integer.MIN_VALUE;
//         int bought = arr[0];
//         for(int i=1; i<arr.length; i++){
//             int profit = arr[i] - bought;
//             if(arr[i]<bought){
//                 bought = arr[i];
//             }
//             maxProfit = Math.max(profit,maxProfit);

//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//     int prices[] = {7,1,5,3,10,4};
//     System.out.println(buyAndSellStocks(prices));
//     }
// }


public class BuyAndSellStocks {

    public static int buyAndSellStocks(int arr[]){
        int maxProfit = 0; //if there is no profit then maxProfit is 0
        int bought = arr[0];
        for(int i=1; i<arr.length; i++){
           if(arr[i]>bought){ // if their is a profit only then calculate
            int profit = arr[i] - bought;
            maxProfit = Math.max(profit,maxProfit);
           }
           else{
                bought = arr[i]; // no profit means stock price is down so buy it 
           }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
    // int prices[] = {7,1,5,3,6,4};
    int prices[] = {7,6,5,4,3,2,1};
    System.out.println(buyAndSellStocks(prices));
    }
}
