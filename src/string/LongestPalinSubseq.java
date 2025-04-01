package string;

public class LongestPalinSubseq {

	public static void longestPalinSubseq(String s1,String s2) {
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++) dp[i][0] = 0;
		for(int j=0;j<=m;j++) dp[0][j] = 0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					dp[i][j] = 1 + dp[i-1][j-1]; 
				}
				else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		System.out.println("LengthOfLongestCommonPlindron Subsequenc: "+dp[n][m]);
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				System.out.print(dp[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public static int longMem(String s1,String s2, int ind1,int ind2) {
		
		if(ind1 < 0 || ind2 < 0) return 0;
		if(s1.charAt(ind1) == s2.charAt(ind2)) {
			return 1 + longMem(s1,s2,ind1-1,ind2-1); 
		}
		return Math.max(longMem(s1,s2,ind1-1,ind2), longMem(s1,s2,ind1,ind2-1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "GEEKSFORGEEKS"; //"bbabcbcab";
		String s2 = new StringBuilder(s1).reverse().toString();
		longestPalinSubseq(s1,s2);
		
		//using memoization
		int leng = longMem(s1,s2,s1.length()-1,s2.length()-1);
		System.out.println("Length :"+leng);

	}

}
