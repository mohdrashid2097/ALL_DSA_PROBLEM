package RecursionAndBacktracking;

import java.util.ArrayList;

public class PrintSubsequenceSumK {
	
	void printSubsequenceK(int ind, ArrayList<Integer> ll, int[] arr, int sum, int s, int n) {
		
		if(ind == n) {
			if(s == sum) {
				System.out.println(ll);
			}
			return;
		}
		
		// pick condition
		ll.add(arr[ind]);
		s += arr[ind];
		printSubsequenceK(ind + 1, ll, arr, sum, s, n);
		
		ll.remove(ll.size()-1);
		s -= arr[ind];
		
		//not pick condition
		printSubsequenceK(ind + 1, ll, arr, sum, s, n);
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		PrintSubsequenceSumK pk = new PrintSubsequenceSumK();
		int[] arr = {1,2,1};
		int sum = 2;
		pk.printSubsequenceK(0, ll, arr, sum, 0, 3);
		
		

	}

}
