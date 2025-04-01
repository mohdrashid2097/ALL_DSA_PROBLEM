package DynamicProgramming;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestRepeatingSubsequence {
	
	public static void LongestRepeatingSubsequence(String s) {
        int n = s.length();
        int[][] dp = new int[n+1][n+1];
        
        for(int i=0;i<=n;i++) dp[i][0] = 0;
        for(int j=0;j<=n;j++) dp[0][j] = 0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(s.charAt(i-1)==s.charAt(j-1) && i!=j){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        for(int i=0;i<=n;i++) {
        	for(int j=0;j<=n;j++) {
        		System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println();
        System.out.println("LengthOfLongestRepeatingSubSequence: "+dp[n][n]);
        
        int i=n;
        int j=n;
        String ans="";
		while(i>0 && j>0 ) {
			//if(s.charAt(i-1) == s.charAt(j-1)) {
			if(dp[i][j] == dp[i-1][j-1]+1) {	
				ans += s.charAt(i-1);
				i--; j--;
			}
			else if(dp[i][j] == dp[i-1][j]) {
				i--;
			}
			else {
				j--;
			}
		}
		
		
		String str = new StringBuilder(ans).reverse().toString();
		System.out.println("Last Result: "+str);
	}

	public static void main(String[] args) {
		String str = "AABEBCDD";
		LongestRepeatingSubsequence(str);
	}

}
