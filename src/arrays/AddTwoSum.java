package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class AddTwoSum {
	
	//O(n) using hash map
	 public static int[] twoSum(int[] nums, int target) {
		 
		 HashMap<Integer, Integer> map = new HashMap<>();
		 
		 for(int i=0;i<nums.length;i++) {
			 int value = target - nums[i];
			 if(map.containsKey(value)) {
				 return new int[] {i,map.get(value)};
			 }
			 map.put(nums[i], i);
		 }
		 
		 // no solution found
		 return new int[] {};
		 
	 }
	 
	 // O(n2)
	 public static int[] twoSumMore(int[] nums, int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(target == nums[i]+nums[j]) {
					return new int[] {i,j};
				}
			}
		}
		 return new int[] {};
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15}; 
		int target = 9;
		int[] res = twoSum(nums,target);
		int[] resMoreComplixty = twoSumMore(nums,target);
		
		System.out.println(Arrays.toString(res));
		System.out.println(Arrays.toString(resMoreComplixty));

	}

}
