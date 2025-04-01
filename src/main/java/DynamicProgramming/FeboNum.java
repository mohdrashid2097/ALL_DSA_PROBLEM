package DynamicProgramming;

import java.util.Arrays;

public class FeboNum {
	
	public static int feb(int n) {
		if(n<=1) {
			return n;
		}
		return feb(n-1) + feb(n-2);	
		
	}
	
	public static int febDp(int n, int[] dp) {
		if(n<=1) {
			return n;
		}
		
		if(dp[n] != -1) return dp[n];
		
		return dp[n] =  febDp(n-1,dp) + febDp(n-2,dp);	
		
	}

	public static void fenNumTbulation(int n) {
		int[] dp = new int[n+1];
		dp[0] = 0;
		dp[1] = 1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(Arrays.toString(dp));
	}
	public static void main(String[] args) {
		
		// 0 1 1 2 3 5 8
		int febNum = feb(5);
		System.out.println(febNum);
		System.out.println();
		
		//using dp
		int[] dp = new int[5+1];
		for(int i=0;i<=5;i++) dp[i] = -1;
		int febNumDp = febDp(5,dp);
		System.out.println(febNumDp);
		System.out.println();
		
		//Using Tabulation
		fenNumTbulation(5);

	}

}
