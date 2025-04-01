package recursionBacktracking;

import java.util.ArrayList;

public class PrintCountSubsequenceSumK {
	
	int printSubsequenceK(int ind, int[] arr, int sum, int s, int n) {
		
		// condition not satisfied
		// strictly done if array contains positives only
		if(s > sum) return 0;
		if(ind == n) {
			
			// if condition is satisfied
			if(s == sum) {
				return 1;
			}
			
			else {
				// if condition is not satisfied
				return 0;
			}
		}
		
		// pick condition
		s += arr[ind];
		int l = printSubsequenceK(ind + 1, arr, sum, s, n);
		s -= arr[ind];
		
		//not pick condition
		int r = printSubsequenceK(ind + 1, arr, sum, s, n);
		
		return l + r;
		
	}

	public static void main(String[] args) {		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		PrintCountSubsequenceSumK pk = new PrintCountSubsequenceSumK();
		int[] arr = {1,2,1};
		int sum = 2;
		System.out.println(pk.printSubsequenceK(0, arr, sum, 0, 3));
		//System.out.println(pk.printSubsequenceK(0, ll, arr, sum, 0, 3));
	}
}