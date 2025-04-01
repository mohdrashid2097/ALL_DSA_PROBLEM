package arrays;

import java.util.Arrays;

public class RearrangeElement {

	 static int partition(int[] arr, int n) {
		
		int j = 0;
		int pivot = 0;
		for(int i=0;i<n;i++) {
			if(arr[i] < pivot) {
				int temp = arr[i];
				    arr[i] = arr[j];
				    arr[j] = temp;
				    j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		return j;
	}
	static void rearrange(int arr[], int n) {
        
		int p = partition(arr,n);
		System.out.println(p);
		for(int i = 0;(i<arr.length && i<p); i=i+2,p++) {
			int temp = arr[i];
			arr[i] = arr[p];
			arr[p] = temp;
		}
    }
	public static void main(String[] args) {
		int n = 9;
		int arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2};
		rearrange(arr,n);
		System.out.println(Arrays.toString(arr));

	}

}
