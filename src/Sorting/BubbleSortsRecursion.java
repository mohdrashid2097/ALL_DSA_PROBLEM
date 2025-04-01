package Sorting;

import java.util.Arrays;

public class BubbleSortsRecursion {
	
	// time complexity O(N2)
	// space complexity O(1)
	public static void bubbleSorts(int[] arr,int n) {
		
		if(n==0 || n==1) return;
		
		for(int i=0;i<n-1;i++) {
			if(arr[i] > arr[i+1]) {
				swap(arr,i,i+1);
			}
		}
		bubbleSorts(arr,n-1);
		
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		  arr[i] = arr[j];
		  arr[j] = temp;
	}

	public static void main(String[] args) {
		int arr[] = {5, 1, 4, 2, 8};
        bubbleSorts(arr,arr.length);
        System.out.println(Arrays.toString(arr));

	}

}
