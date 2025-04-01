package stackQueueQuestion;

public class PrintSbArrayContiguous {

	/*
	 * public static void printSubArray(int[] arr, int n) { for(int i=0;i<n;i++) {
	 * for(int j=i;j<n;j++) { for(int k=i;k<=j;k++) { System.out.print(arr[k]); }
	 * System.out.println(); } } }
	 */
	/*
	 * static void printSubArrays(int[] arr, int start, int end) {
	 * 
	 * if (end == arr.length) return; else if (start > end) { printSubArrays(arr, 0,
	 * end + 1); } else { int min = arr[start]; for (int i = start; i <= end; i++) {
	 * System.out.print(arr[i] + ", "); min = Math.min(arr[i],min);
	 * System.out.println("Min :"+min); } System.out.println(); printSubArrays(arr,
	 * start + 1, end); } return; }
	 */
	
	/*
	 * public static void printSubArraysOne(int[] arr, int n) {
	 * 
	 * int sum = 0; for(int i=0;i<arr.length;i++) { int min = arr[i]; for(int
	 * j=i;j<arr.length;j++) { min = Math.min(arr[j], min); sum += min; } }
	 * System.out.println(sum); }
	 */
	
	static int printSubArrays(int[] arr, int start, int end,int sum)
    {
		if(end == arr.length) return sum;
		
		if(start > end) {
			return printSubArrays(arr,0,end+1,sum);
		}
			int min = arr[start];
			for(int i=start;i<=end;i++) {
				System.out.print(arr[i]+" ");
				min = Math.min(arr[i], min);
			}
			System.out.println();
			sum += min;
			return printSubArrays(arr,start+1,end,sum);
    }
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		//printSubArray(arr,arr.length);
		//printSubArrays(arr, 0, 0);
		//printSubArraysOne(arr, arr.length);
		System.out.println(printSubArrays(arr,0,0,0));

	}

}
