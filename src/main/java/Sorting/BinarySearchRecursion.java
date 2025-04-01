package Sorting;

public class BinarySearchRecursion {
	
	public static int binarySearch(int[] arr, int target,int start, int end) {
		
		if(start <= end) {
			int mid = start +(end - start)/2;
			if(arr[mid] == target) return mid;
			
			if(arr[mid] > target) {
				return binarySearch(arr,target,start,mid-1);
			}
			else {
				return binarySearch(arr,target,mid+1,end);
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 50, 60, 80, 110, 130, 140, 170};
		int target = 110;
		int ans = binarySearch(nums,target,0,nums.length-1);
		System.out.println(ans);

	}

}
