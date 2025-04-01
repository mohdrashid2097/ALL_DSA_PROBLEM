package StackQueueQuestion;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElements {
	public static void nextLargerElement(long[] arr, int n)
    { 
        long[] res = new long[n];
		/*
		 * if(n == 0){ return; } for(int i=0;i<n-1;i++){ res[i] =
		 * helper(arr,arr[i],i+1,n); } res[n-1] = -1;
		 * System.out.println(Arrays.toString(res));
		 */
		 int i=0;
		 while(i<n-1) {
			 long el = arr[i];
			 int j=i+1;
			 long nel = 0;
			 System.out.println(el);
			  while(j<n) {
				  if(el < arr[j]) {
					  nel = arr[j];
					  break;
				  }
				  j++;
			  }
			  if(nel == 0) {
				  res[i] = -1;
			  }else {
				  res[i] = nel;  
			  }
			  i++;
		 }
		 res[n-1] = -1;
		 System.out.println(Arrays.toString(res));
    }
    public static long helper(long[] arr,long el,int i,int n){
        for(int j=i;j<n;j++){
            if(el < arr[j]){
                el = arr[j];
                return el;
            }
        }
        return -1;
    }

    static void printNGE(int arr[], int n)
    {
    	Stack<Integer> s = new Stack<>();
        int nge[] = new int[n];
  
        for (int i = arr.length - 1; i >= 0; i--)
        {
            /* if stack is not empty, then
            pop an element from stack.
            If the popped element is smaller
            than next, then
            a) print the pair
            b) keep popping while elements are
            smaller and stack is not empty */
            if (!s.empty())
            {
                while (!s.empty() 
                       && s.peek() <= arr[i])
                {
                    s.pop();
                }
            }
            nge[i] = s.empty() ? -1 : s.peek();
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(nge));
    }
    public static void main(String[] args) {
		int arr[] = {1, 3, 2, 4};
		//int arr[] = {7, 8, 1, 4};
		int n = 4;
		printNGE(arr,n);

	}

}
