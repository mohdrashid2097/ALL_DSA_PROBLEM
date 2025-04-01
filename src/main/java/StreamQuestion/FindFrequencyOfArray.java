package StreamQuestion;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// this is for array
		int[] arr = {1,2,3,4,5,6,1,5,2,3,1,4,2,4};
		Map<Integer,Long> res = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Frequency of array element: " );
		System.out.println(res);
		
		//count the frequency of stream character
		String str = "MohdRashidSiddiqui";
		Map<Character,Long> resStr = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Frequency of character into String:");
		System.out.println(resStr);
		
		//array of character
		Character[] arr1 = {'a', 'b', 'b', 'c', 'c', 'c'};
		Map<Character,Long> resChar = Arrays.stream(arr1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Frequency Count in character of array: ");
		System.out.println(resChar);
	}

}
