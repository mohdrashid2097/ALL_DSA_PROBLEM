package comparatorNCompareTo;

import java.util.ArrayList;
import java.util.List;

public class SortingExample {
	
	public static void subArraySum(int[] arr, int n, int sum) {
		
		List<Integer> ll = new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int curr_sum = arr[i];
			for(int j=i+1;j<n;j++) {
				curr_sum += arr[j];
				if(curr_sum == sum) {
					System.out.println("i :"+i+" "+j);
					ll.add(i);
					ll.add(j);
				}
			}
			
		}
		System.out.println(ll);
	}

	public static void main(String[] args) {
		//int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int[] arr = {1,2,3,7,5};
		int n = arr.length;
        //23
		int sum = 12;
        subArraySum(arr, n, sum);

	}

}
