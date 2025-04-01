package dynamicProgramming;

public class CoinsChangeMinCoinsToFormAmount {
	
	public static int helper(int ind, int[] coins, int n, int amount) {
		if(amount == 0) return 0;
		if(ind == n) return Integer.MAX_VALUE-1;  //just returing infinity if there is no combination
		if(coins[ind] > amount) return helper(ind+1, coins,n,amount);
		
		int take = 1 + helper(ind,coins,n,amount-coins[ind]);
		int skip = 0 + helper(ind+1,coins,n,amount);
		
		return Math.min(take, skip);
		
	}
	
	public static int helperMemoization(int ind,int[] coins,int amount,int n,int[][] dp) {
		if(amount == 0) return 0;
		if(ind == n) return Integer.MAX_VALUE-1; // Just to assign infinity value if combiantion not found
		
		if(dp[ind][amount] != -1) return dp[ind][amount];
		
		if(coins[ind] > amount) return dp[ind][amount] = helperMemoization(ind+1,coins,amount,n,dp);
		
		int take = 1 + helperMemoization(ind,coins,amount-coins[ind],n,dp);
		int skip = 0 + helperMemoization(ind+1,coins,amount,n,dp);
		
		return dp[ind][amount] = Math.min(take, skip);
	}
	public static void coinChange(int[] coins,int amount) {
		int n = coins.length;
		int ans = helper(0,coins,n,amount);
		int res = ans != Integer.MAX_VALUE-1?ans:-1;
		System.out.println("Minimum coins to form amount: "+res);
		
		//using memoization dp approach
		int[][] dp = new int[n+1][amount+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=amount;j++) {
				dp[i][j] = -1;
			}
		}
		
		int ansDp = helperMemoization(0,coins,amount,n,dp);
		int resDp = ansDp != Integer.MAX_VALUE-1?ansDp:-1;
		System.out.println("Find Minimum Coins to form amount: "+resDp);
	}
	

	public static void main(String[] args) {
		int[] coins = {1,2,5};
		int amount = 11;
		coinChange(coins,amount);
	}

}
