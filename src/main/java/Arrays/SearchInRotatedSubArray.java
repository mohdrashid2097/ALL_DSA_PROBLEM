package Arrays;

public class SearchInRotatedSubArray {
	
	public static int findMin(int[] arr) {
		int l=0;
		int h=arr.length - 1;
		
		while(l<=h) {
			
			if(arr[l] <= arr[h]) {
				return arr[l];
			}
			
			int mid = l +(h-l)/2;
			
			if(arr[mid] > arr[h]) {
				l = mid+1;
			}
			else {
				h = mid;
			}
			
		}
		return arr[l];
	}
    
	public static void main(String[] args) {
		
		int[] arr = {4, 5, 6, 7, 1, 2};
		System.out.println(findMin(arr));

	}

}
