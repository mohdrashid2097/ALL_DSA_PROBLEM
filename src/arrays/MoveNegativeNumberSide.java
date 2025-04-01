package arrays;

import java.util.Arrays;

public class MoveNegativeNumberSide {
	
	//here changing element
	public static void rearrange(int[] arr, int n) {
		
		int j=0,temp=0;
		for(int i=0;i<n;i++) {
			if(arr[i] > 0) {
				if(i!=j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	// without changing order of element
	public static void reArrangeWithOrder(int[] arr,int n) {
		
		int[] temp = new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i] >= 0) {
				temp[j++] = arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i] < 0) {
				temp[j++] = arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
		}
		System.out.println("Temp :"+Arrays.toString(temp));
		System.out.println("Arrays :"+Arrays.toString(arr));
	}
	public static void main(String[] args) {
		int arr[] =  {1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;
        System.out.println("Original Order: "+Arrays.toString(arr));
       // System.out.println("Without Order");
        //rearrange(arr, n);
        System.out.println("With Order");
        reArrangeWithOrder(arr, n);

	}

}
