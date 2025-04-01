package Sorting;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int target) {
		int end = arr.length-1;
		int start = 0;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid] == target) return mid;
			
			if(arr[mid] > target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
		int target = 60;
		int ans = binarySearch(nums,target);
		System.out.println(ans);

	}
}
