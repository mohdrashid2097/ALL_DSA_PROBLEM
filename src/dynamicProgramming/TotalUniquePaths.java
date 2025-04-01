package dynamicProgramming;

public class TotalUniquePaths {

	public static int uniquePathOne(int i,int j) {
		if(i==0 && j==0) return 1;
		if(i<0 || j<0) return 0;
		int up = uniquePathOne(i-1,j);
		int left = uniquePathOne(i,j-1);
		return up+left;
	}
	
	public static int uniquePathTwo(int i,int j, int[][] dp) {
		if(i==0 && j==0) return 1;
		if(i<0 || j<0) return 0;
		if(dp[i][j] != -1) return dp[i][j];
		int up = uniquePathOne(i-1,j);
		int left = uniquePathOne(i,j-1);
		return dp[i][j]=up+left;
		
	}
	
	public static void uniquePathTabulation(int m,int n) {
		int[][] dp = new int[m][n];
		dp[0][0] = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0 && j==0) dp[i][j] = 1;
				else {
					int up=0;
					int left =0;
					if(i>0) {
						up = dp[i-1][j];
					}
					if(j>0) {
						left = dp[i][j-1];
					}
					dp[i][j] = up+ left;
				}
			}
		}
		
		System.out.println("Tabulation: "+dp[m-1][n-1]);
	}
	
	public static void uniquePathTabulationOptimize(int m,int n) {
		int[] prev = new int[n];
		
		for(int i=0;i<m;i++) {
			int[] curr = new int[m];
			for(int j=0;j<n;j++) {
				if(i==0 && j==0) curr[j] =1;
				else {
					int up=0;
					int left=0;
					if(i>=0) up = prev[j];
					if(j>0) left = curr[j-1];
					curr[j] = up+left;
				}
			}
			prev = curr;
		}
		
		System.out.println("Space optimized: "+prev[n-1]);
	}
	public static void main(String[] args) {
		
		int m=3;
		int n=3;
		// recursion way
		int onepath = uniquePathOne(m-1,n-1);
		System.out.println("OneUniquePaths: "+onepath);
		
		//using memoization
		int[][] dp = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				dp[i][j] = -1;
			}
		}
		int twopath = uniquePathTwo(m-1,n-1,dp);
		System.out.println("TwoUniquePaths: "+twopath);
		
		//tabulation way
		uniquePathTabulation(m,n);

		//tabulation optimize solution way
		uniquePathTabulationOptimize(m,n);
	}

}
