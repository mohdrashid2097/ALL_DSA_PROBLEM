package arrays;

import java.util.Arrays;

public class PushZerosToEnd {

	public static void pushZerosToEnd(int[] arr, int n) {
        int count=0;
        for(int i=0;i<n;i++) {
        	if(arr[i] != 0) {
        		arr[count++] = arr[i];
        	}
        }
        while(count<n) {
        	arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
	
	public static void pushZero(int[] arr,int n) {
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i] !=0) {
				swap(arr,i,j);
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr,int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static void main(String[] args) {
		//int arr[] = {3, 5, 0, 0, 4};
		//pushZerosToEnd(arr,arr.length);
		int[] A = { 5, 6, 0, 4, 6, 0, 9, 0, 8 };
        int n = A.length;
        pushZero(A,n);

	}

}
