package BitManipulation;

//Java program to find two odd
//occurring elements

import java.util.*;

public class MainOne
{
	

	static void printTwoOdd(int arr[], int size)
	{
	/* Will hold XOR of two odd occurring elements */
	int xor2 = arr[0];
	
	/* Will have only single set bit of xor2 */
	int set_bit_no;
	int i;
	int n = size - 2;
	int x = 0, y = 0;
	
	for(i = 1; i < size; i++)
		xor2 = xor2 ^ arr[i];
	
	set_bit_no = xor2 & ~(xor2-1);
	
		for(i = 0; i < size; i++)
	{
		if((arr[i] & set_bit_no)>0)
		x = x ^ arr[i];
		else
		y = y ^ arr[i];
	}
	
	System.out.println("The two ODD elements are "+
										x + " & " + y);
	}
	

	public static void main(String[] args)
	{
		//int arr[] = {4, 2, 4, 5, 2, 3, 3, 1};
		int[] arr ={34, 52, 45, 15, 23, 23, 22, 22, 34, 52, 15, 9, 34, 23, 22, 43, 9,
				23, 23, 23, 23, 45, 9, 34, 22, 22, 22, 52, 34, 23, 34, 43, 23, 23, 34, 22, 22, 9, 52, 43, 27, 34};
		int arr_size = arr.length;
		printTwoOdd(arr, arr_size);
	}
}

