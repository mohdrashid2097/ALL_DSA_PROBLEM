package dynamicProgramming;

public class GridMinimumSumDP {
	
	public static int recFun(int i,int j,int[][] grid) {
		if(i == 0 && j == 0) return grid[i][j];
		
		if(i < 0 || j < 0) return (int)Math.pow(10, 2); // here i am returning larger value
		
		int up =   grid[i][j] + recFun(i-1, j, grid);
		int left = grid[i][j] + recFun(i, j-1, grid);
		
		return Math.min(left,up);
	}
	
	public static int recFunDp(int i,int j,int[][] grid, int[][] dp) {
		if(i == 0 && j == 0) return grid[i][j];
		
		if(i < 0 || j < 0) return (int)Math.pow(10, 2); // here i am returning larger value
		if(dp[i][j] != -1) return dp[i][j];
		int up =   grid[i][j] + recFunDp(i-1, j, grid,dp);
		int left = grid[i][j] + recFunDp(i, j-1, grid,dp);
		
		return dp[i][j] = Math.min(left,up);
	}
	
	public static void recFunTabulation(int n,int m,int[][] grid) {
		int[][] dp = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(i==0 && j==0) dp[i][j] = grid[i][j];
				else {
					int up=grid[i][j];
					if(i>0) {
						up +=dp[i-1][j];
					}
					else {
						up += Math.pow(10, 2);
					}
					
					int left=grid[i][j];
					if(j>0) {
						left +=dp[i][j-1];
						}
					else {
						left += Math.pow(10, 2);
						}
					dp[i][j] = Math.min(up, left);
				}
			}
		}
		System.out.println("Tabulation: "+dp[n-1][m-1]);
	}
	
	public static void recFunTabulationSpace(int n,int m,int[][] grid) {
		int[] prev = new int[m]; // this is my column
		for(int i=0;i<n;i++) {
			int[] curr = new int[m];   // this is my current row
			for(int j=0;j<m;j++) {
				if(i==0 && j==0) curr[j]= grid[i][j];
				else {
					int up=grid[i][j];
					if(i>0) {
						up += prev[j];
					}
					else {
						up += Math.pow(10, 2);
					}
					
					int left=grid[i][j];
					if(j>0) {
						left +=curr[j-1];
						}
					else {
						left += Math.pow(10, 2);
						}
					curr[j] = Math.min(up, left);
				}
			}
			prev = curr;
		}
		System.out.println("Tabulation: "+prev[m-1]);
	}
	
	public static void main(String[] args) {
		
		int[][] grid = {{5,9,6},
						{11,5,2}};
		int n =	grid.length;
		int m = grid[0].length;
		//Recusrion way
		System.out.println("Rcursion: "+recFun(n-1,m-1,grid));
		
		//recursion overlapping
		int[][] dp = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println("Rcursion: "+recFunDp(n-1,m-1,grid,dp));
		
		//tbulation way
		recFunTabulation(n,m,grid);
		
		//space optimizatio
		recFunTabulationSpace(n,m,grid);
		
	}
}
