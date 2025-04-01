package dynamicProgramming;

import java.util.Arrays;

public class NumberofLongestIncreasingSubsequence {
	
	public static void numOfSubS(int[] nums) {
		int n= nums.length;
		int[] t = new int[n];
		Arrays.fill(t, 1);
		int[] count = new int[n];
		Arrays.fill(count, 1);
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i] > nums[j]) {
					if(t[j]+1 > t[i]) {
						t[i] = t[j] +1;
						count[i] = count[j];
					}
					else if( t[j] +1 == t[i]) {
						count[i] = count[i] + count[j];
					}
				}
			}
		}
		int maxlength = 0;
		for(int i=0;i<n;i++) maxlength = Math.max(maxlength, t[i]);
		
		int numOfSubS = 0;
		for(int i=0;i<n;i++) {
			if(t[i] == maxlength) {
				numOfSubS += count[i];
			}
		}
		System.out.println("num of subsequence: "+numOfSubS);
	}
	public static void main(String[] args) {
		int[] nums = {2,2,2,2,2};
		numOfSubS(nums);
	}

}
