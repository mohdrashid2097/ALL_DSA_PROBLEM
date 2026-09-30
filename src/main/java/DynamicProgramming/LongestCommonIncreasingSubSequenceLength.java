package DynamicProgramming;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonIncreasingSubSequenceLength {
	
	public static int helperRecusion(int ind,int[] nums, int prev, int n) {
		
		//base condition
		if(ind==n) return 0;
		
		// skip condition
		int skip = 0 + helperRecusion(ind+1,nums,prev,n);
		int take = 0;
		if(prev==-1 || nums[ind] > nums[prev]) {
			take = 1 + helperRecusion(ind+1,nums,ind,n);
		}
		
		return Math.max(skip, take);	
	}
	
	public static int helperRecusion1(int ind,int[] nums, int prev, int n, List<Integer> ds, List<Integer> lic) {
		
		//base condition
		if(ind==n) {
			
			if(ds.size()>lic.size()) {
				lic.clear();
				lic.addAll(ds);
			}
			return 0;
		}
		
		// skip condition
		int skip = 0 + helperRecusion1(ind+1,nums,prev,n, ds, lic);
		
		int take = 0;
		if(prev==-1 || nums[ind] > nums[prev]) {
			ds.add(nums[ind]);
			take = 1 + helperRecusion1(ind+1,nums,ind,n,ds, lic);
			ds.remove(ds.size()-1);
		}
		
		return Math.max(skip, take);	
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 1, 5, 2, 6};
        int n = nums.length;

        int result = helperRecusion(0, nums, -1, n);

        System.out.println("LIS length: " + result);
        
        List<Integer> ds = new ArrayList<>();
        List<Integer> lic = new ArrayList<Integer>();
        int result1 = helperRecusion1(0, nums, -1, n,ds,lic);
        System.out.println("LIS length: " + result1);
        System.out.println("LIS Element: "+ lic);

	}

}
