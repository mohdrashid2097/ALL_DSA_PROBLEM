package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	//The goal is to find all combinations of numbers from an array whose sum equals the target. You can select the same number
	//multiple times, but different orders of the same combination are not counted separately
	//Combination Sum: You can use the same array element multiple times.
	void combination(int ind, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
		
		if(ind == arr.length) {
			if(target == 0) {
				ans.add(new ArrayList<Integer>(ds));
			}
			return;
		}
		
		// pick
		if(arr[ind] <= target) {
			ds.add(arr[ind]);
			combination(ind,arr,target - arr[ind], ans, ds);
			//Remove the last selected number so that we can explore another possibility without keeping the previous choice.
			ds.remove(ds.size()-1);
		}
		
		//not pick
		combination(ind+1,arr,target,ans,ds);
		
	}
	
	List<List<Integer>> findCombination(int ind, int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		combination(ind,arr,target,ans,new ArrayList<>());
		return ans;
		
	}

	public static void main(String[] args) {
		
		CombinationSum cs = new CombinationSum();
		int[] arr = {2,3,6,7};
		int target = 7;
		System.out.println(cs.findCombination(0,arr,target));

	}

}
