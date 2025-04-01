package arrays;

public class SecondLargestElement {

	public static void secondLargest(int[] arr, int n) {
		int max = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		int secondMax = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] < max && arr[i] >= secondMax) {
				secondMax=arr[i];
			}
		}
		System.out.println("1st max Element: "+max);
		System.out.println("2st max Element: "+secondMax);
	}
	public static void secondSmallest(int[] arr, int n) {
		int smallest = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		int secondSmallest = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest=arr[i];
			}
		}
		System.out.println("1st smallest Element: "+smallest);
		System.out.println("2st secondSmallest Element: "+secondSmallest);
	}
	
	public static void secondLargest1(int[] arr,int n) {
		int small = arr[0];
		int max = arr[0];
		for(int i=0;i<n;i++) {
			if(arr[i] < small) {
				small = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max :"+max+" "+"Small :"+small);
		
		int small1 = Integer.MAX_VALUE;
		int secndSmall = Integer.MAX_VALUE;
		int maximun = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			small1 = Math.min(small1, arr[i]);
			maximun = Math.max(maximun, arr[i]);
		}
		System.out.println("Max :"+maximun+" "+"Small :"+small1);
		
		for(int i=0;i<n;i++) {
			if(arr[i] < secndSmall && arr[i] != small1) {
				secndSmall = arr[i];
			}
			if(arr[i] > secondMax && arr[i] != maximun) {
				secondMax = arr[i];
			}
		}
		System.out.println(secndSmall+"   "+secondMax);
	}
	
	public static void smallLargest(int arr[], int n) {
		
		int small = Integer.MAX_VALUE;
		int small2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			
			//this is for max & 2ndMax
			if(arr[i] > max1) {
				max2 = max1;
				max1 = arr[i];
			}
			else if( arr[i] > max2 && arr[i] != max1) {
				max2 = arr[i];
			}
			
			//this for min & 2ndMin
			
			if(arr[i] < small) {
				small2 = small;
				small = arr[i];
			}
			else if(arr[i] < small2 && arr[i] != small) {
				small2 = arr[i];
			}
			
		}
		System.out.println("Max1 :"+max1+" max2 :"+max2);
		System.out.println("Small :"+small+" Small2 :"+small2);
		
	}
	public static void main(String[] args) {
		int arr[] = {12, 35, 1, 10, 34, 1};
		//int arr1[] = {22,61, 30, 28, 47, 42, 25, 41, 56, 27, 45, 44, 34, 46, 35, 58, 36,
				//60, 29, 53, 55, 32, 31, 33, 59, 50, 51, 52, 37, 39, 38, 43, 49, 54, 57, 40, 26, 48};
		//secondLargest1(arr,arr.length);
		//secondSmallest(arr,arr.length);
		smallLargest(arr,arr.length);
	}

}
