package Arrays;

public class UpperLowerBound {
	
	public static int upperBound(int[] arr,int target) {
		int l=0;
		int r=arr.length;
		while(l<r) {
			int mid = l+ (r-l)/2;
			if(arr[mid] <= target) {
				l = mid + 1;
			}
			else {
				r = mid;
			}
			
		}
		return l;
	}
	
	public static int lowerBound(int[] arr, int target) {
	    int l = 0, r = arr.length; // r is length (exclusive)
	    while (l < r) {
	        int mid = l + (r - l) / 2;
	        if (arr[mid] < target) {
	            l = mid + 1; // go right, because mid is too small
	        } else {
	            r = mid ;     // go left, mid could be the answer
	        }
	    }
	    return l; // smallest index with arr[l] >= target
	}

	
	public static void main(String[] args) {
		//int[] arr = {2, 3, 7, 10, 11, 11, 25}; 
		int[] arr = {2, 3, 7, 9, 9, 9, 11};
		int target = 9;
		System.out.println(upperBound(arr,target));
		System.out.println(lowerBound(arr,target));

	}

}
