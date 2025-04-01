package DynamicProgramming;

import java.util.Arrays;

public class FindNumberOfLIS {
	
	public static void findNumberOfLIS(int[] arr,int n) {
		int[] dp = new int[n];
		int[] cnt = new int[n];
		int maxiLen = 1;
		for(int i=0;i<n;i++) dp[i] = 1;
		for(int i=0;i<n;i++) cnt[i] = 1;
		for(int ind = 0;ind<n;ind++) {
			for(int prev = 0;prev<ind;prev++) {
				if(arr[prev] < arr[ind] && 1 + dp[prev] > dp[ind]) {
					dp[ind] = 1 + dp[prev];
					// inherit
					cnt[ind] = cnt[prev];
				}
				else if(arr[prev] <arr[ind] && 1+dp[prev]==dp[ind]) {
					// increase the count
					cnt[ind] += cnt[prev];
				}
			}
			maxiLen = Math.max(maxiLen, dp[ind]);
		}
		
		int nos = 0;
		for(int i=0;i<n;i++) {
			if(dp[i] == maxiLen) {
				nos += cnt[i];
			}
		}
		
		System.out.println("dp: "+Arrays.toString(dp));
		System.out.println("cnt: "+Arrays.toString(cnt));
		System.out.println("MaxLength: "+maxiLen);
		System.out.println("Nos: "+nos);
	}
	
//	    If you want to verify, this is how the solution should look:
//		array:  1 5 4 3 2 6 7 10 8 9 
//		length: 1 2 2 2 2 3 4 5 5 6 
//		count:  1 1 1 1 1 4 4 4 4 4

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,5,4,7};
		int n = arr.length;
		findNumberOfLIS(arr,n);
		
		//arr: 1,3,5,4,7
		//dp:  1,2,3,3,4
		//cnt  1,1,1,1,2

	}

}
