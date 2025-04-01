package recursionBacktracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
	void combination(int ind, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds) {
		
		if(ind == arr.length) {
			if(target == 0) {
				ans.add(new ArrayList<Integer>(ds));
			}
			return;
		}
		
		if(arr[ind] <= target) {
			ds.add(arr[ind]);
			combination(ind,arr,target - arr[ind], ans, ds);
			ds.remove(ds.size()-1);
		}
		
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
