package RecursionAndBacktracking;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

	public class CombinationSum2 {
		
		//Combination Sum II: Each array element can be used only once, even if the array contains duplicate values. 
		//The answer must not contain duplicate combinations.
		
		public void combination(int ind, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
		
			if(target == 0) {
				ans.add(new ArrayList<>(ds));
				return;
			}
			
			for(int i = ind;i<arr.length;i++) {
				//If the current element equals the previous element, and we are not at the beginning of this loop level, skip it
				if(i>ind && arr[i] == arr[i-1]) continue;
				//If an element is greater than the remaining target, we can stop the loop early.
				if(arr[i] > target) break;
				
				// Pick the element
				ds.add(arr[i]);
				// Move to the next index: each element is used once
				combination(i +1,arr,target - arr[i], ans, ds );
				// Backtrack
				ds.remove(ds.size()-1);
			}
			
	}
	
	List<List<Integer>> findCombination(int ind, int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		
		//Duplicate values become adjacent, so we can skip duplicate combinations.
		Arrays.sort(arr);
		
		combination(ind,arr,target,ans,new ArrayList<>());
		return ans;
		
	}

	public static void main(String[] args) {
		
		CombinationSum2 cs = new CombinationSum2();
		//int[] arr = {10,1,2,7,6,1,5};
		//int target = 8;
		int[] arr = {1,1,2,3};
		int target = 5;
		System.out.println(cs.findCombination(0,arr,target));

	}
}
