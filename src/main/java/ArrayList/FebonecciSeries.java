package ArrayList;

import java.util.Arrays;

public class FebonecciSeries {
	
	public static void feboSeries(int n) {
		
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<n;i++) {
			n3 = n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void feboSeriesArray(int n) {
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2;i<n;i++) {
			arr[i] = arr[i-1]+arr[i-2];
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		
		feboSeries(10);
		feboSeriesArray(10);

	}

}
