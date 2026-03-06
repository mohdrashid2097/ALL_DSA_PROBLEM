package Coins;

public class CoinsProblemDP {

    public static int countWays(int[] coins, int target) {
    	
    	//Tabulation
        int n = coins.length;

        int[][] dp = new int[n+1][target+1];

        for(int i=0;i<=n;i++)
            dp[i][0] = 1;

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=target;j++) {

                if(coins[i-1] <= j)
                    dp[i][j] = dp[i][j - coins[i-1]]   //(include coin)
                    		+ dp[i-1][j];              //(exclude coin)
                else
                    dp[i][j] = dp[i-1][j];
            }
        }

        return dp[n][target];
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int target = 5;

        System.out.println("Total ways: " + countWays(arr,target));
    }
}
