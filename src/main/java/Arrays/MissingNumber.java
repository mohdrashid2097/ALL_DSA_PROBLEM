package Arrays;

import java.util.Arrays;

public class MissingNumber {

	public static int missingNumber1(int A[], int N) {
		int num = 0;
		int[] temp = new int[N+1];
		for(int i=0;i<A.length;i++) {
			//int index = a[i];
			//index = index -1;
			//temp[index] = a[i];
			temp[A[i]-1] = A[i];
		}
		for(int i=0;i<temp.length;i++) {
			if(temp[i] == 0) {
				num = i+1;
				break;
			}
		}
		
		return num;
	}
	
	public static int missingNumber(int A[], int N) {
		int num = 0;
		int[] temp = new int[N];
		for(int i=0;i<N;i++) {
			temp[i] = 0;
		}
		for(int i=0;i<A.length;i++) {
			temp[A[i] -1] = 1;
		}
		for(int i=0;i<N;i++) {
			if(temp[i] == 0) {
				num = i+1;
			}
		}
		
		return num;
	}
	
	public static int getMissingNo(int[] nums, int n)
    {
        int sum = (n * (n + 1))/ 2;
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }
	public static void main(String[] args) {
		int N = 5;                                        
		int A[] = {1, 2, 4, 3};
		//System.out.println(missingNumber(A,N));
		//System.out.println(Arrays.toString(a));
		int[] arr = { 1, 2, 3, 5 };
        int n = arr.length;
        System.out.println(getMissingNo(arr, n));
	}

}
