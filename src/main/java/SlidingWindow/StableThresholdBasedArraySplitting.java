package SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StableThresholdBasedArraySplitting {
	
	public static void helper(int[] arr,int threshold) {
		List<Integer> ll1 = new ArrayList();
		List<Integer> ll2 = new ArrayList();
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]<threshold) {
				ll1.add(arr[i]);
			}
			else {
				ll2.add(arr[i]);
			}
		}
		
		ll1.addAll(ll2);
		System.out.println("StableBasedArraySplit: "+ll1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Stable Threshold-Based Array Splitting
		int[] arr = {7, 2, 5, 1, 6, 3};
		int threshold = 5;
		
		// 1- Approach  TC-O(n2)
		//              SC-O(1)
		
		int position=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] < threshold) {
				int temp = arr[i];
				for(int j=i;j>position;j--) {
					arr[j] = arr[j-1];
				}
				arr[position] = temp;
				position++;
			}
		}
		System.out.println("StableThresholdBasedArraySplitting: "+Arrays.toString(arr));
		
		//2nd approach with TC-O(n) & SC-O(n)
		helper(arr,threshold);

	}

}
