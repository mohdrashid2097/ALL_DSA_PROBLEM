package prefixQuestions;

import java.util.HashMap;

public class PrefixQuestionsList {
	
	public static void subArrayExists(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum +=arr[j];
				if(sum==0) {
					System.out.println(i+" "+j);
				}
			}
		}
	}
	
	public static void subArrayExistsTwo(int[] arr) {
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		int sum = 0;
		int start =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			if(mp.containsKey(sum)) {
				start = mp.get(sum) +1 ;
				System.out.println(start+" : "+i);
				break;
			}
			else {
				mp.put(sum, i);
			}
		}
	}
	
	public static void countSubArray(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i;j<arr.length;j++) {
				sum += arr[j]==0?-1:1;
				if(sum ==0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	public static void countSubarrWithEqualZeroAndOne(int[] arr) {
		int ans = 0;
		int sum =0;
		HashMap<Integer,Integer> mp = new HashMap<>();
		mp.put(0, 1);
		for(int i=0;i<arr.length;i++) {
			sum += arr[i]==0?-1:1;
			if(mp.containsKey(sum)) {
				ans += mp.get(sum);
				mp.put(sum, mp.get(sum)+1);
			}else {
				mp.put(sum, 1);
			}
		}
		System.out.println(ans);
	}
	
	public static void maxLen(int[] arr) {
		int longest=0;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum += arr[j]==0?-1:1;
				 if(sum == 0) { 
//					 if( longest < j-i+1) 
//					 { 
//						 longest = j - i +1; 
//					}
				
					 longest = Math.max(longest, j-i+1);
				}
			}
		}
		System.out.println(longest);
	}
	
	public static void maxLenInSubArray(int[] arr) {
		int maxLen = 0;
		int sum = 0;
		HashMap<Integer,Integer> mp = new HashMap<>();
		mp.put(0, 1);
		for(int i=0;i<arr.length;i++) {
			sum += arr[i]==0?-1:1;
			if(mp.containsKey(sum)) {
				int indx = mp.get(sum);
				maxLen = Math.max(maxLen, i- indx);
			}
			else {
				mp.put(sum, i);
			}
		}
		System.out.println(maxLen);
	}

	public static void main(String[] args) {
		
		//Given an array of positive and negative numbers, the task is to find if there is a subarray (of size at least one) with 0 sum.
		int[] arr = {4, 2, -3, 1, 6};
		//subArrayExists(arr);
		//subArrayExistsTwo(arr);
		
		//Given an array arr[] of size n containing 0 and 1 only. The problem is to count the subarrays having an equal number of 0's and 1's.
		int[] arr1 = {1, 0, 0, 1, 0, 1, 1};
		//countSubArray(arr1);
		//countSubarrWithEqualZeroAndOne(arr1);
		
		//Given an array arr[] containing only 0s and 1s, find the longest subarray which contains equal no of 0s and 1s.
		int[] arr2 = {1, 0, 1, 1, 1, 0, 0};
		//maxLen(arr2);
		//maxLenInSubArray(arr2);

	}

}
