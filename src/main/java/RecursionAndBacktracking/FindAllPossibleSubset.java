package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class FindAllPossibleSubset {
	
	public void helper(int ind, int[] arr,List<List<Integer>> ans ,List<Integer> ds) {
		
		if(ind==arr.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		//pick condition
		ds.add(arr[ind]);
		helper(ind+1, arr, ans, ds);
		ds.remove(ds.size()-1);
		
		//not pick condition
		helper(ind+1,arr, ans, ds);
	}
	
	public List<List<Integer>> findAllPossibleSubset(int[] arr){
		
		List<List<Integer>> ans = new ArrayList<>();
		helper(0, arr, ans, new ArrayList());
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllPossibleSubset ss = new FindAllPossibleSubset();
		int[] nums = {1,2,2};
		System.out.println(ss.findAllPossibleSubset(nums));
	}

}
