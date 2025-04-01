package Sorting;

public class FindCeilingNumber {

	public static void main(String[] args) {
		
		int[] arr = {2,3,9,14,16,18};
		int target = 5;
		int ans = findCeilingNumber(arr, target);
		System.out.println(ans);
	}
	
	static int findCeilingNumber(int[] arr, int target) {
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			
			int mid = start + (end - start)/2;
			
			if(target == arr[mid]) {
				return arr[mid];
			}
			else if(target < arr[mid + 1]) {
				return arr[mid + 1];
			}
			
			if(target > arr[mid]) {
				start = mid + 1; 
			}
			else {
				end = mid - 1;
			}
		}
		
		return -1;
	}

}
