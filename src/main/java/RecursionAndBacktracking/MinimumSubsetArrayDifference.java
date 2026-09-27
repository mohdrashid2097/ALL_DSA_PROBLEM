package RecursionAndBacktracking;

public class MinimumSubsetArrayDifference {
	
	public int helper(int ind, int[] arr, int sum1, int totalSum) {
		
		//base condition
		if(ind == arr.length) {
			int sum2 = totalSum-sum1;
			return Math.abs(sum1-sum2);
		}
		
		//pick condition
		int pick = helper(ind+1,arr,sum1+arr[ind],totalSum);
		
		//not pick condition
		int notPick = helper(ind+1,arr, sum1,totalSum);
		
		return Math.min(pick, notPick);
		
	}
	
	public int minimumDifference(int[] arr) {
		int totalSum=0;
		for(int element:arr) {
			totalSum += element;
		}
		
		return helper(0,arr,0,totalSum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinimumSubsetArrayDifference obj = new MinimumSubsetArrayDifference();
		 int[] arr = {1, 2, 3, 4};

	     System.out.println(obj.minimumDifference(arr));
	     //Time complexity: O(2n), because each element has two choices.
	     //Auxiliary space: O(n) for the recursion stack.

	}

}
