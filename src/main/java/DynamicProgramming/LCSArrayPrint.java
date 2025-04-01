package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LCSArrayPrint {
	
	public static void fTabulation(int[] arr,int n) {
		int[] dp = new int[n];
		for(int i=0;i<n;i++) dp[i] = 1;
		int maxiLen = 1;
		for(int ind=0;ind<n;ind++) {
			for(int prev = 0;prev<ind;prev++) {
				if(arr[prev] < arr[ind]) {
					dp[ind] = Math.max(dp[ind], 1 + dp[prev]);
				}
			}
			maxiLen = Math.max(maxiLen, dp[ind]);
		}
		
		System.out.println(Arrays.toString(dp));
		System.out.println("Maxi Length: "+maxiLen);
	}
	
	public static void fTabulationPrintLIS(int[] arr,int n) {
		int[] dp = new int[n];
		int[] hash = new int[n];
		for(int i=0;i<n;i++) dp[i] = 1;
		int maxiLen = 1;
		int lastIndex = 0;
		for(int ind=0;ind<n;ind++) {
			for(int prev = 0;prev<ind;prev++) {
				if(arr[prev] < arr[ind] && 1 + dp[prev] > dp[ind]) {
					//dp[ind] = Math.max(dp[ind], 1 + dp[prev]);
					dp[ind] = 1 + dp[prev];
					hash[ind] = prev;
				}
			}
			//maxiLen = Math.max(maxiLen, dp[ind]);
			if(dp[ind] > maxiLen) {
				maxiLen = dp[ind];
				lastIndex = ind;
			}
		}
		
		ArrayList<Integer> ll = new ArrayList<>();
		ll.add(arr[lastIndex]);
		while(hash[lastIndex] != lastIndex) {
			lastIndex = hash[lastIndex];
			ll.add(arr[lastIndex]);
			
		}
		Collections.sort(ll);
		System.out.println(ll);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {5,4,11,1,16,8};
		int[] arr = {40 ,31 ,22 ,77 ,42 ,91 ,41 ,63 ,64 ,49 ,15 ,59, 65, 52, 52, 14, 51, 24, 17, 42 ,50 ,19 ,78 ,55, 80 ,40 ,72 ,66 ,74, 22};
		int n = arr.length;
		fTabulation(arr,n);
		fTabulationPrintLIS(arr,n);

	}

}
