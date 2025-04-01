package stackQueueQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallest {
	
	static void immediateSmaller(int arr[], int n) {
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        int next,i,j;
        for(i=0;i<n;i++){
            next =-1;
            for(j=i+1;j<n;j++){
                if(arr[j] < arr[i]){
                    next = arr[j];
                    break;
                }
            }
            arr[i] = next;
        }
        System.out.println(Arrays.toString(arr));
    }

	public static void main(String[] args) {
		int[] arr = {4, 2, 1, 5, 3};
		immediateSmaller(arr,arr.length);

	}

}
