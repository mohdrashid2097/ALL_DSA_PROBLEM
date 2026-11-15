package SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCompleteSubArraysInAnArray {
	
	//2799. Count Complete Sub Arrays in an Array
	public static int countCompleteSubarrays(int[] nums) {
        int result = 0;
        int n = nums.length;
        int i = 0;
        int j = 0;
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        Set<Integer> set = new HashSet<Integer>();
        // adding all the element so that we can get size of unique element
        for(int e:nums) set.add(e);
        int size = set.size();
        
        while(j<n) {
        	// count frequency of each element in the array
        	freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
        	
        	while( freq.size() == size ) {
        		result += (n-j);
        		freq.put(nums[i], freq.get(nums[i])-1);
        		if(freq.get(nums[i]) == 0) freq.remove(nums[i]);
        		i++;
        	}
        	j++;
        	
        }
        
        
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-gen erated method stub
		int[] nums = {1,3,1,2,2};
		System.out.println("countCompleteSubarrays: "+countCompleteSubarrays(nums));

	}

}
