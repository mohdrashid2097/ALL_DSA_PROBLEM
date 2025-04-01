package Arrays;

public class MaxContiguosSum {

     static void maxSubarraySum(int arr[], int n){
        
        int max_so_far = Integer.MIN_VALUE;
        int max_here = 0;
        for(int i=0;i<n;i++){
            max_here = max_here + arr[i];
            if(max_so_far < max_here){
                max_so_far = max_here;
            }
            if(max_here < 0){
               max_here = 0;
            }
        }
        
        System.out.println(max_so_far);
    }
	public static void maxSubArray(int[] arr, int n) {
		int max_sum = Integer.MIN_VALUE;
		int start =0;
		int end =0;
		for(int i=0;i<n;i++) {
			int curr_sum = 0;
			for(int j=i;j<n;j++) {
				curr_sum += arr[j];
				if(curr_sum > max_sum) {
					max_sum = curr_sum;
					start = i;
					end = j;
				}
			}
		}
		System.out.println("Start :"+start+" "+" End :"+end);
		System.out.println(max_sum);
	}
	public static void main(String[] args) {
		//int arr[]={-2,1,-3,4,-1,2,1,-5,4};
		int[] arr = {-2,-3,4,-1,-2,1,5,-3};
		int n = arr.length;
		maxSubArray(arr,n);
		maxSubarraySum(arr,n);

	}

}
