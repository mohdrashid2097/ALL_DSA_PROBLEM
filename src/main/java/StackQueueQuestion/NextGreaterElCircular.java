package StackQueueQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElCircular {

	static void nextGreaterElement(int arr[], int n) {
        // code here
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        int next,i,j;
        for(i=0;i<n;i++){
        	System.out.println("i:"+i);
            next = -1;
            for(j=i+1;j<n*2-1;j++){
            	System.out.println("J"+j);
                if(i==j%n) {
                	System.out.println("Break");
                	break;
                }
               
                if(arr[j%n] > arr[i]){
                    next = arr[j%n];
                    System.out.println("Next :"+next);
                    break;
                }
            }
            
            nge[i] = next;
        }
        System.out.println(Arrays.toString(nge));
    }
	
	static void nextGreaterElementUsingStack(int arr[], int n) {
		Stack<Integer> st = new Stack<>();
		int[] res = new int[n];
		for(int i=2*n-1;i>=0;i--) {
			// Remove all the elements in Stack that are less than arr[i%n]
			while(!st.isEmpty() && st.peek() <= arr[i%n]) {
				res[st.peek()] = arr[i%n];
				st.pop();
			}
			 if(i < n)
	            {
	                if(!st.isEmpty())
	                    res[i] = st.peek();
	                else
	                    res[i] = -1; // When none of elements in Stack are greater than arr[i%n]
	            }
			st.push(arr[i%n]);
		}
		System.out.println(Arrays.toString(res));
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 1};
		//int arr[] = {7, 8, 1, 4};
		int n = 3;
		nextGreaterElementUsingStack(arr,n);

	}

}
