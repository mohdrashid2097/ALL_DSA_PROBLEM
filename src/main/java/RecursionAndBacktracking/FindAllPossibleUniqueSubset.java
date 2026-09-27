package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindAllPossibleUniqueSubset {
	
	//It is a recursion and backtracking problem where we need to generate all possible subsets of an array that may contain duplicate elements, 
	//but we must not return duplicate subsets.
	
	//This Subset II problem finds all possible unique subsets of the given array. It does not calculate their sums.
	void findSubsets(int ind,int[] nums,List<Integer> ds,List<List<Integer>> ansList) {
		
		ansList.add(new ArrayList<>(ds));
		for(int i = ind; i<nums.length; i++) {
			if(i != ind && nums[i] == nums[i-1]) continue;
			ds.add(nums[i]);
			findSubsets(i + 1, nums, ds, ansList);
			ds.remove(ds.size()-1);
		}
	}
	
	public List<List<Integer>> subsetWithDup(int[] nums){
		Arrays.sort(nums);
		List<List<Integer>> ansList = new ArrayList<>();
		findSubsets(0, nums, new ArrayList<>(), ansList);
		
		return ansList;
	}

	public static void main(String[] args) {
		
		FindAllPossibleUniqueSubset ss = new FindAllPossibleUniqueSubset();
		int[] nums = {1,2,2};
		System.out.println(ss.subsetWithDup(nums));

	}

}
