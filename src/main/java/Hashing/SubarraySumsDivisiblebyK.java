package Hashing;

public class SubarraySumsDivisiblebyK {

	public static void subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        for(int i=1;i<n;i++) {
        	nums[i] += nums[i-1];
        }
        
        int result = 0;
        for(int i=0;i<n;i++) {
        	for(int j=i;j<n;j++) {
        		int sum = i==0?nums[j]: nums[j] - nums[i-1];
        		if(sum%k == 0) {
        			result++;
        		}
        	}
        }
        System.out.println("subarraysDivByK : "+result);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,0,-2,-3,1};
		int k = 5;
		subarraysDivByK(nums,k);
	}

}
