package Arrays;

import java.util.HashMap;

public class SumOfSubArray {

	public static void lenOfLongSubarr (int[] arr, int n, int k) {
        int maxLength=0;
		for(int i = 0 ; i < n; i++) {
			int sum = 0;
        	for(int j = i;j < n; j++) {
        		sum = sum + arr[j];
        		if(sum==k) {
        			maxLength = Math.max(maxLength, j);
        		}
        	}
        }
		System.out.println("MaxLength :"+maxLength);		
    }
	
	static void lenOfLongSubarray(int[] arr, int n, int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int maxLength = 0;
		for(int i=0;i<n;i++) {
			sum += arr[i];
			if(sum == k) {
				maxLength = i+1;
			}
			if(!map.containsKey(sum)) {
				map.put(sum, i);
			}
			if(map.containsKey(sum-k)) {
				if(maxLength < i - map.get(sum-k)) {
					maxLength = i - map.get(sum-k);
				}
			}
		}
		System.out.println("Map :"+map);
		System.out.println("MaxLengthc :"+maxLength);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 10, 5, 2, 6, 1, 1, 9 };
		int k = 15;
		int n = arr.length;
		//lenOfLongSubarr (arr,n,k);
		lenOfLongSubarray(arr,n,k);

	}

}
