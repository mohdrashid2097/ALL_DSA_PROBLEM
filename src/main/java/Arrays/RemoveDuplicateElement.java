package Arrays;

import java.util.Arrays;

public class RemoveDuplicateElement {
	
	public static void removeDuplicates(int[] arr,int n) {
		
		if(n==0 || n==1) {
			System.out.println(arr);
		}
		
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n-1];
		System.out.println(Arrays.toString(temp));
		for(int i=0;i<j;i++) {
			System.out.print(temp[i]+" ");
		}
		
	
	}

	public static void removeDuplicates1(int[] arr, int n) {
		int j=0;
		for(int i=0;i<n-1;i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		System.out.println("J "+j);
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void rotate(int[] arr1,int n) {
		
		int k=2;
		int r = 1;
		while(r <= k) {
			int first = arr1[0];
			for(int i=0;i<n-1;i++) {
				arr1[i] = arr1[i+1];
			}
			arr1[n - 1] = first;
			r++;
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void rotate1(int[] arr1,int n) {
		int j=0;
		int[] temp =new int[n];
		for(int i=2;i<2+n;i++) {
			temp[j++] = arr1[i%n];
		}
		System.out.println(Arrays.toString(temp));
	}
	
	public static void bestSolution(int[] arr, int n) {
		
		if(n==0 || n==1) return;
		int d = 2;
		d = d%n;
		// reverse starting index element d
		reverse(arr,0,d-1);
		// reverse element from d to n-1
		reverse(arr,d,n-1);
		// reverse all the element
		reverse(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}
	static void reverse(int[] arr, int start, int end) {
		while(start < end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		//int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        //int n = arr.length;
        //removeDuplicates(arr, n);
        //removeDuplicates(arr, n);
        
        //int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        //rotate(arr1,arr1.length);
        //rotate1(arr1,arr1.length);
        //bestSolution(arr1,arr1.length);

	}

}
