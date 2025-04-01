package Arrays;

import java.util.Arrays;

public class SortArray012Like {

	public static void sort012(int a[], int n)
    {
        int zeros = 0;
        int ones = 0;
        int two = 0;
        int count =0;
        for(int i=0;i<n;i++){
            if(a[i] ==0) zeros++;
            if(a[i] ==1) ones++;
            if(a[i] ==2) two++;
        }
        while(zeros !=0) {
        	a[count++] =0;
        	zeros--;
        }
        while(ones !=0) {
        	a[count++] =1;
        	ones--;
        }
        while(two !=0) {
        	a[count++] =2;
        	two--;
        }
        
       System.out.println(Arrays.toString(a));
    }
	
	public static void sortZeroOneTwo(int arr[], int n1) {
		
		int l=0;
		int r=n1-1;
		for(int i=0;i<n1 && i <= r;) {
			//if current element 0
			if(arr[i] == 0) {
				swap(arr,i,l);
				i++;
				l++;
			}
			
			// if current element 2
			else if(arr[i] == 2) {
				swap(arr,i,r);
				r--;
			}
			else
				i++;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void swap(int[] arr,int i, int l) {
		int temp = arr[i];
		arr[i] = arr[l];
		arr[l] = temp;
	}
	public static void main(String[] args) {
		int[] a = {0 ,2 ,1 ,2 ,0};
		int n = a.length;
		sort012(a,n);
		
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int n1 = arr.length;
		sortZeroOneTwo(arr,n1);

	}

}
