package dynamicProgramming;

public class LongestCommonSubstring {
	
	public static void LongestCommonSubstr(String s1,String s2) {
		int n=s1.length();
		int m=s2.length();
		
		int row=0;
		int col=0;
		int maxValue = Integer.MIN_VALUE;
		int[][] dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++) dp[i][0] =0;
		for(int j=0;j<=m;j++) dp[0][j] =0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1];
					
					if(dp[i][j] > maxValue) {
						maxValue = dp[i][j];
						row=i;
						col=j;
					}
				}
				else {
					dp[i][j] =0;
				}
			}
		}
		System.out.println("Length of common SubString b/w 2 string: "+ maxValue);
		System.out.println("****This is to get Common substring******");
		String ans ="";
		while(dp[row][col] != 0) {
			ans = s1.charAt(row-1) + ans;
			row--;
			col--;
			
		}
		System.out.println("Common Substring: "+ans);
	}

	public static void main(String[] args) {
		String s1="ABCDGH";
		String s2="ACDGHR";
		//output: CDGH
		
		LongestCommonSubstr(s1,s2);
		
	}

}
