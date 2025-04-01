package HeapMaxMinQuestion;

import java.util.Arrays;

public class MinHeapEMaxInsertINCDNCKeyE {

	public static void buildHeap(int[] arr) {
		int n= arr.length;
		//build a heap from all internal node
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void heapify(int[] arr,int n,int i) {
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if(l<n && arr[l] < arr[largest]) {
			largest = l;
		}
		if(r<n && arr[r] < arr[largest]) {
			largest = r;
		}
		if( largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr,n,largest);
		}
	}
	
	public static void extractMin(int[] arr) {
		if(arr.length < 0) {
			System.out.println("Wrong Operation :");
		}
		int minValue = arr[0];
		arr[0] = arr[arr.length-1];
		int n = arr.length-1;
		for(int i=(n/2)-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		System.out.println(minValue);
		System.out.println(Arrays.toString(arr));
	}
	public static void increaseKey(int[] arr,int index,int key) {
		if( key < arr[index]) {
			System.out.println("Wrong Operation :");
		}
		arr[index] = key;
		while( index > 0 &&  arr[index/2] < arr[index] ) {
			int temp = arr[index/2];
			arr[index/2] = arr[index];
			arr[index] = temp;
			index = index/2;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void decreaseKey(int[] arr,int index, int key) {
		if(arr[index] < key) {
			System.out.println("Wrong Operation:");
		}
		arr[index] = key;
		heapify(arr,arr.length,index);
		System.out.println(Arrays.toString(arr));
	}
	public static void insertElemet(int[] arr,int key) {
		// in heapSize, now we have ll as a heap.. 
		//n = n+1; in list, size increase by deafult
		int[] newArr = new int[arr.length + 1];
		for(int i=0;i<arr.length;i++) {
			newArr[i] = arr[i];
		}
		int ind = newArr.length -1;
		newArr[ind] = key;
		while(ind > 0 && newArr[ind/2] < newArr[ind]) {
			int temp = newArr[ind/2];
			newArr[ind/2] = newArr[ind];
			newArr[ind] = temp;
			ind = ind/2;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
	}
	public static void main(String[] args) {
		// min heap not completed..
		
		int[] arr = {3,6,5,0,8,2,9};
		buildHeap(arr);
		//extractMin(arr);
		//increaseKey(arr,1,20);
		//decreaseKey(arr,1,4);
		//int[] insertArr = {9, 6, 5, 0, 4, 2, 3};
		//insertElemet(insertArr,30);
	}

}

