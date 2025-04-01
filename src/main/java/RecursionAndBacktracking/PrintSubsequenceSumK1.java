package RecursionAndBacktracking;

import java.util.ArrayList;

public class PrintSubsequenceSumK1 {
	

	boolean printSubsequenceK(int ind, ArrayList<Integer> ll, int[] arr, int sum, int s, int n) {
		
		if(ind == n) {
			
			// if condition is satisfied
			if(s == sum) {
				System.out.println(ll);
				
				return true;
			}
			return false;
			
		}
		
		// pick condition
		ll.add(arr[ind]);
		s += arr[ind];
		if(printSubsequenceK(ind + 1, ll, arr, sum, s, n) == true) {
			return true;
		}
		
		ll.remove(ll.size()-1);
		s -= arr[ind];
		
		//not pick condition
		if(printSubsequenceK(ind + 1, ll, arr, sum, s, n) == true)
			return true;
		
		return false;
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> ll = new ArrayList<Integer>();
		PrintSubsequenceSumK1 pk = new PrintSubsequenceSumK1();
		int[] arr = {1,2,1};
		int sum = 2;
		pk.printSubsequenceK(0, ll, arr, sum, 0, 3);
		//System.out.println(pk.printSubsequenceK(0, ll, arr, sum, 0, 3));
		
		

	}

}
