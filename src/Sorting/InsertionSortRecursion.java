package Sorting;

import java.util.Arrays;

public class InsertionSortRecursion {
	
	public static void insertionSort(int[] arr, int n,int i) {
		if(i>=n) return;
		
		int key = arr[i];
		int j = i - 1;
		while( j>=0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j = j - 1;
		}
		arr[j+1] = key;
		
		insertionSort(arr,n,i+1);
	}

	public static void main(String[] args) {
		 int arr[] = { 12, 11, 13, 5, 6,2,1 };
		 insertionSort(arr,arr.length,1);
		 System.out.println(Arrays.toString(arr));

	}

}
