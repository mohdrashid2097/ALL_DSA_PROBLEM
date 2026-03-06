package Coins;

import java.util.Arrays;

public class CoinsProblemMemoization {

	//Memoization
    static int[][] dp;

    public static int f(int[] arr, int t, int n) {

        if (t == 0) return 1;
        if (n == 0) return 0;
        if (t < 0) return 0;

        if (dp[n][t] != -1)
            return dp[n][t];

        dp[n][t] = f(arr, t - arr[n - 1], n)   // include coin
                + f(arr, t, n - 1);            // exclude coin

        return dp[n][t];
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        int t = 5;
        int n = arr.length;

        dp = new int[n+1][t+1];

        for(int[] row : dp)
            Arrays.fill(row,-1);

        System.out.println("Total ways: " + f(arr,t,n));
    }
}
