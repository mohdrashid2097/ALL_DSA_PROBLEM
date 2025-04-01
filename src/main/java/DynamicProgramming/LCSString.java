package DynamicProgramming;

public class LCSString {
	
	public static int lcs(String s1,String s2,int ind1,int ind2) {
		
		if(ind1 <0 || ind2 <0) {
			return 0;
		}
		
		if(s1.charAt(ind1) == s2.charAt(ind2)) {
			return 1+ lcs( s1, s2, ind1-1,ind2-1);
		}
		
		return Math.max(lcs(s1,s2,ind1-1,ind2), lcs(s1, s2,ind1,ind2-1));
		
	}
	
	public static int lcsDp(String s1,String s2,int i,int j, int[][] dp) {
		
		if(i <0 || j <0) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(s1.charAt(i) == s2.charAt(j)) {
			return dp[i][j] = 1+ lcsDp( s1, s2, i-1,j-1, dp);
		}
		
		return dp[i][j] = Math.max(lcsDp(s1,s2,i-1,j,dp), lcsDp(s1, s2,i,j-1,dp));
		
	}

	// doing shifting here
	public static int lcsDpShifting(String s1,String s2,int i,int j, int[][] dp) {
		
		if(i ==0 || j ==0) {
			return 0;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(s1.charAt(i-1) == s2.charAt(j-1)) {
			return dp[i][j] = 1+ lcsDp( s1, s2, i-1,j-1, dp);
		}
		
		return dp[i][j] = Math.max(lcsDp(s1,s2,i-1,j,dp), lcsDp(s1, s2,i,j-1,dp));
		
	}
	
	public static void lcsTabulation(String s1,String s2) {
		int n = s1.length();
		int m = s2.length();
		int[][] dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++) dp[i][0] =0;
		for(int j=0;j<=m;j++) dp[0][j] =0;
		
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
		
		System.out.println(dp[n][m]);
		
		
	}
	
	// space optimization do not do this 
	public static void lcsTabulationTwo(String s1,String s2) {
		int n = s1.length();
		int m = s2.length();
		int[] prev = new int[n+1];
		int[] curr = new int[m+1];
		for(int i=0;i<=n;i++) prev[i] =0;
		//for(int j=0;j<=m;j++) curr[j] =0;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				if(s1.charAt(i-1) == s2.charAt(j-1)) {
					curr[i] = 1 + prev[i-1];
				}
				else {
					curr[i] = Math.max(prev[j], curr[i]);
				}
			}
			
			prev = curr;
		}
		
		
		System.out.println(prev[m]);
		
		
	}
	
	public static void main(String[] args) {
		
		String s1 = "acd";
		String s2 = "ced";
		
		int n =s1.length();
		int m =s2.length();
		
		//recurssion approach
		int lcsRes = lcs(s1,s2,n-1,m-1);
		System.out.println("Common Length1: "+lcsRes);
		System.out.println();
		
		//using dp array
		int[][] dp = new int[n+1][m+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				dp[i][j] = -1;
			}
		}
		int lcsResDp = lcsDp(s1,s2,n-1,m-1,dp);
		System.out.println("Method 2: "+lcsResDp);
		
		int lcsResDpShifting = lcsDpShifting(s1,s2,n-1,m-1,dp);
		System.out.println("Method Shifting : "+lcsResDpShifting);
		
		//tabulation method
		lcsTabulation(s1,s2);
		
		//Space optimization
		lcsTabulationTwo(s1,s2);

	}

}
