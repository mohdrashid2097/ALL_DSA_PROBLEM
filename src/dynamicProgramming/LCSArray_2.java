package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LCSArray_2 {
	
	public static int helperRecusion(int ind, int[] nums, int prev, int n){
        if(ind==n) return 0;

        //skip condition
        int skip = 0 + helperRecusion(ind+1, nums, prev,n);
        // take condition
        int take =0;
        if(prev==-1 || nums[ind]>nums[prev]){
            take = 1+helperRecusion(ind+1,nums,ind,n);
        }
        return Math.max(take,skip);
   }
	public static int helperDpMemoization(int ind, int[] nums, int prev, int n,int[][] dp){
        if(ind==n) return 0;
        
        if( prev != -1 && dp[ind][prev] != -1) return dp[ind][prev];
        
        //skip condition
        int skip = 0 + helperRecusion(ind+1, nums, prev,n);
        // take condition
        int take =0;
        if(prev==-1 || nums[ind]>nums[prev]){
            take = 1+helperRecusion(ind+1,nums,ind,n);
        }
        if(prev != -1) {
        	dp[ind][prev]= Math.max(take,skip);
        }
        return Math.max(take,skip);
	}
	
	public static void helperDpTabulation(int[] arr) {
		int n = arr.length;
		int[] t = new int[n];
		Arrays.fill(t, 1);
		int maxLength = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i] > arr[j]) {
					t[i] = Math.max(t[i], t[j]+1);
					maxLength = Math.max(maxLength, t[i]);
				}
			}
		}
		System.out.println("Using helperDpTabulation: "+ maxLength);
	}
	
	public static void helperPrintLIS(int[] arr) {
		int n = arr.length;
		int[] t = new int[n];
		Arrays.fill(t, 1);
		int[] prev = new int[n];
		Arrays.fill(prev, -1);
		int maxLength = 1;
		int lastIndex = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(arr[i] > arr[j] && t[i] < t[j]+1) {
					//t[i] = Math.max(t[i], t[j]+1);
					t[i] = t[j] + 1;
					prev[i] = j;
				}
			}
			//maxLength = Math.max(maxLength, t[i]);
			if(maxLength < t[i]) {
				maxLength = t[i];
				lastIndex = i;
			}
		}
		System.out.println("Using PrintLIS: "+ maxLength);
		//System.out.println(Arrays.toString(prev));
		//System.out.println("lastindex: "+lastIndex);
		List<Integer> ans = new ArrayList<>();
		for(int i=lastIndex;i>=0;i=prev[i]) {
			ans.add(arr[i]);
			if(prev[i]==-1) break;
		}
		Collections.reverse(ans);
		System.out.println("LIS: "+ans);
	}

	public static void main(String[] args) {
		int[] arr = {10,9,2,5,3,7,101,18};
		int n = arr.length;
		System.out.println("Using Recusrion: "+helperRecusion(0,arr,-1,arr.length));
		
		// using dp array
		int[][] dp = new int[n+1][n+1];
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println("Using Recusrion: "+helperDpMemoization(0,arr,-1,n,dp));
		
		
		helperDpTabulation(arr);
		
		System.out.println("******Print LIS********");
		int[] arr1 = {40 ,31 ,22 ,77 ,42 ,91 ,41 ,63 ,64 ,49 ,15 ,59, 65, 52, 52, 14, 51, 24, 17, 42 ,50 ,19 ,78 ,55, 80 ,40 ,72 ,66 ,74, 22};
		helperPrintLIS(arr1);
	}

}
