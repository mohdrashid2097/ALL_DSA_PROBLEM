package Arrays;

public class MaxSumISubArrays {

	public static void pairWithMaxSum(int arr[], int N)
    {
		int max_sum = 0;
        for(int i=0;i<N-1;i++) {
        	int curr_sum = 0;
        	for(int j=i;j<=i+1;j++) {
        		curr_sum += arr[j];
        		if(max_sum < curr_sum) {
        			max_sum = curr_sum;
        		}
        	}
        }
        System.out.println(max_sum);
    }
	
	public static void main(String[] args) {
		//int arr[] = {4, 3, 1, 5, 6};
		int arr[] = {5, 4, 3, 1, 6};
		pairWithMaxSum(arr,arr.length);

	}

}
