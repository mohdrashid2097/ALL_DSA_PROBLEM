package recursionBacktracking;

public class ReverseArray {
	
	void fn(int i, int[] arr, int n) {
		if(i >= n/2) {
			return;
		}
		//swap(arr[i],arr[n-i-1]);
		swapElement(i,arr,n);
		fn(i+1,arr,n);
	}
	
	void swapElement(int i, int[] arr, int n) {
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1] = temp;
	}

	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		int[] arr = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		ra.fn(0,arr,arr.length);
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
