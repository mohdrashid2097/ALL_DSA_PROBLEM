package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueSubsetSum {
	
	public void helper(int ind,int[] nums,Set<Integer> hs, int sum) {
		if(ind == nums.length) {
			hs.add(sum);
			return;
		}
		
		// pick condition
		helper(ind+1,nums,hs,sum+nums[ind]);
		
		//not pick condition
		helper(ind+1,nums,hs,sum);
	}
	
	public List<Integer> uniqueSubsetSum(int[] nums) {
		Set<Integer> hs = new HashSet();
		helper(0,nums,hs,0);
		List<Integer> ans = new ArrayList<>(hs);
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UniqueSubsetSum ss = new UniqueSubsetSum();
		int[] nums = {1,2,2};
		System.out.println(ss.uniqueSubsetSum(nums));

	}

}
