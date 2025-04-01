package Sorting;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		
		int[] arr = {18,17,16,15,14,13,12,9,8,7,4,5};
		int target = 16;
		int ans = orderAgnosticBS(arr, target);
		System.out.println(ans);

	}
	
	static int orderAgnosticBS(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length -1;
		
		boolean isAsc = arr[start] < arr[end];
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(target == arr[mid]) {
				return mid;
			}
			
			if(isAsc) {
				if(target < arr[mid]) {
					end = mid - 1;
				}
				else {
					start =  mid + 1;
				}
			}
			else {
				if(target > arr[mid]) {
					end = mid - 1;
				}
				else {
					start =  mid + 1;
				}
			}
			
		}
		 
		
		return -1;
	}
	

}
