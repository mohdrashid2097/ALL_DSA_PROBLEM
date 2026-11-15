package SlidingWindow;

public class CountSubArraysWithScoreLessThanK {
	
	public static long countSubarrays(int[] nums, long k) {
		int n = nums.length;
        int i = 0;
        int j = 0;
        long result = 0;
        long sum = 0;
        
        while(j<n) {
        	sum += nums[j];
        	
        	// shrink the window if score > k
        	while(i<=j && sum*(j-i+1) >= k) {
        		sum -= nums[i];
        		i++;
        	}
        	
        	result += (j-i+1);
        	j++;
        }
        
        return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,4,3,5};
		int k = 10;
		System.out.println("countSubarrays: "+countSubarrays(nums,k));

	}

}
