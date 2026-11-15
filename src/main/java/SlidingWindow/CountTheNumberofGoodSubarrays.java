package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberofGoodSubarrays {
	
	//2537. Count the Number of Good Subarrays
	// TC - O(n), SC - O(n)
	
    public static long countGood(int[] nums, int k) {
    	int n = nums.length;
    	long result=0;
    	int i=0;
    	int j=0;
    	int pairs=0;
    	Map<Integer,Integer> freq = new HashMap();
    	
    	while(j<n) {
    		
    		pairs += freq.getOrDefault(nums[j], 0); // isse pehle kitni bar dekha hai hmne
    		freq.put(nums[j], freq.getOrDefault(nums[j], 0)+1);
    		
    		while(pairs >= k) {
    			result += (n-j);
    			freq.put(nums[i], freq.get(nums[i])-1);
    			pairs -= freq.get(nums[i]);
    			i++;
    		}
    		j++;
    		
    	}
    	
    	return result;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,1,1,1}; 
		int k = 10;
		
		System.out.println("CountTheNumberofGoodSubarrays: "+countGood( nums, k));
		
		

	}

}
