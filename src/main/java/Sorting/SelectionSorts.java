package Sorting;

import java.util.Arrays;

public class SelectionSorts {

	// space complexity = O(1)
	// time complexity = O(N2)
	public static void sorts(int[] arr) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int index = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			
			int temp = arr[i];
			  arr[i] = arr[index];
			  arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] = {64,25,12,22,22,11};
        sorts(arr);
	}

}
