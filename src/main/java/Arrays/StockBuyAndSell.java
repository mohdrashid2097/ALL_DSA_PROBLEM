package Arrays;

public class StockBuyAndSell {
	
	public static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit  = 0;
		
		for(int price:prices) {
			if(price < minPrice) {
				minPrice = price;
			}
			
			int profit = price - minPrice;
			
			if(profit > maxProfit) {
				maxProfit = profit;
			}
		}
		
		return maxProfit;
	}
	
	public static int maxTotalProfit(int[] prices) {
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
		
		// If multiple buy and sell transactions are allowed, then you can earn profit 
		// whenever the next day's price is greater than today's price.
		
		System.out.println("Maximum Profit: " + maxTotalProfit(prices));

	}

}
