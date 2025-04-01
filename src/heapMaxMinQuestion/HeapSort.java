package heapMaxMinQuestion;

import java.util.Arrays;

public class HeapSort {
	
	static void sort(int[] arr) {
		int n = arr.length;
		
		// build an heap, heapify all the internal node
		for(int i=((n/2)-1) ;i>=0;i--) {
			heapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
		
		//extract element from max_heap one by one
		for(int i = n-1;i>0;i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			
			// call max-heapify on the reduced node
			heapify(arr,i,0);
		}
	}

	static void heapify(int[] arr, int n, int i) {
		int largest = i;
		int lChild = 2*i+1;
		int rChild = 2*i+2;
		if(lChild < n && arr[lChild] > arr[largest]) {
			largest = lChild;
		}
		
		if(rChild < n && arr[rChild] > arr[largest]) {
			largest = rChild;
		}
		if( largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr,n,largest);
		}
	}
	public static void main(String[] args) {
		//int[] arr = {12,11,13,5,6,7};
		int[] arr = {3,6,5,0,8,2,9};
		int[] array = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
		sort(array);
		System.out.println(Arrays.toString(array));
	}

}
