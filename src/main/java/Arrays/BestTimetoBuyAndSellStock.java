package Arrays;

public class BestTimetoBuyAndSellStock {
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price:prices) {
			 // update minimum buying price
			if(price < minPrice) {
				minPrice = price;
			}
			// calculate current profit
			int profit = price - minPrice;
			// update maximum profit
			if(maxProfit < profit) {
				maxProfit = profit;
			}
		}
		return maxProfit;
	}
	
	public static int maxProfitMultipleTransaction(int[] prices) {
		//You can buy yesterday
		//Sell today
		//Capture every upward trend
		
		int maxProfit = 0;
		for(int i=1;i<prices.length;i++) {
			if(prices[i] > prices[i-1]) {
				maxProfit += prices[i] - prices[i-1]; 
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum Profit: " + maxProfit(prices));
        
        //StockProfitMultipleTransactions 
        //"What if multiple buy/sell transactions are allowed?"
        //If multiple buy and sell transactions are allowed, then you can earn profit whenever the next day's price is greater than today's price.
        System.out.println("Maximum Profit: " + maxProfitMultipleTransaction(prices));
        
        //TC O(n)
        //SC O(1)

	}

}
