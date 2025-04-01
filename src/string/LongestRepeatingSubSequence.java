package string;

public class LongestRepeatingSubSequence {
	
	public static void findLongestRepeatingSubSeq(String str) {
		int n = str.length();
		int[][] dp = new int[n+1][n+1];
		for(int i=0;i<=n;i++) dp[i][0] = 0;
		for(int j=0;j<=n;j++) dp[0][j] = 0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(str.charAt(i-1) == str.charAt(j-1) && (i != j)) {
					dp[i][j] = 1+ dp[i-1][j-1];
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println(dp[n][n]);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabb";
		findLongestRepeatingSubSeq(str);

	}

}
