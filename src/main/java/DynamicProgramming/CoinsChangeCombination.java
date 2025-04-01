package DynamicProgramming;

public class CoinsChangeCombination {
	
	public static int coinsChangeRecursion(int ind,int amount,int[] coins,int n) {
		if(amount == 0) return 1;
		if(ind == n) return 0;
		if( amount < coins[ind]) return coinsChangeRecursion(ind+1,amount,coins,n);
		
		int take = coinsChangeRecursion(ind,amount - coins[ind],coins,n);
		int skip = coinsChangeRecursion(ind+1,amount,coins,n);
		
		return take + skip;
	}
	
	public static int coinsChangeMemoization(int ind,int amount,int[] coins,int n,int[][] dp) {
		if(amount == 0) return 1;
		if(ind == n) return 0;
		
		if(dp[ind][amount] != -1) return dp[ind][amount];
		
		if( amount < coins[ind]) return dp[ind][amount] = coinsChangeRecursion(ind+1,amount,coins,n);
		
		int take = coinsChangeRecursion(ind,amount - coins[ind],coins,n);
		int skip = coinsChangeRecursion(ind+1,amount,coins,n);
		
		return dp[ind][amount] = take + skip;
	}


	public static void main(String[] args) {
		int amount = 5;
		int[] coins = {1,2,5};
		int n = coins.length;
		System.out.println("Possible ways: "+coinsChangeRecursion(0,amount,coins,n));
		
		int[][] dp = new int[n+1][amount+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=amount;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println("Possible ways: "+coinsChangeMemoization(0,amount,coins,n,dp));
				

	}

}
