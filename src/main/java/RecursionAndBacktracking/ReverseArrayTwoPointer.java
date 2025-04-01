package RecursionAndBacktracking;

public class ReverseArrayTwoPointer {
	
	void fn(int l, int[] arr, int r) {
		if(l >= r/2) {
			return;
		}
		//swap(arr[i],arr[n-i-1]);
		swapElement(l,arr,r);
		fn(l+1,arr,r-1);
	}
	
	void swapElement(int l, int[] arr, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

	public static void main(String[] args) {
		ReverseArrayTwoPointer ra = new ReverseArrayTwoPointer();
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		ra.fn(0,arr,arr.length-1);
		
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
