package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.List;

public class PrintPermute2ndApproach {
	
	public void helper(int index, int[] nums, List<List<Integer>> ans) {
		if(index == nums.length) {
			//copy the ds to ans;
			List<Integer> ds = new ArrayList<>();
			for(int i = 0; i<nums.length; i++) {
				ds.add(nums[i]);
			}
			ans.add(new ArrayList<>(ds));
			return;
		}
		
		for(int i = index; i<nums.length; i++) {
			swap(i,index,nums);
			helper(index + 1, nums, ans);
			swap(i, index, nums);
		}
		
		
	}
	
	public void swap(int i, int j, int[] nums) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}
	
	public List<List<Integer>> recurPermute(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
		helper(0,nums,ans);
		return ans;
	}

	public static void main(String[] args) {
		PrintPermute2ndApproach pp = new PrintPermute2ndApproach();
		int[] nums = {1,2,3};
		System.out.println(pp.recurPermute(nums));
	}

}
