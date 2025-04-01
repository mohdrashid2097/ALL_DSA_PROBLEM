package StreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.*;

public class DuplicateArrayHighestLowest {

	public static void main(String[] args) {
		
		List<Integer> ll = Arrays.asList(2,4, 6, 3, 6, 5);
		int[] arr = {2,4, 6, 3, 6, 5};
		//2nd hights element in duplicate array----
		int hightest = Integer.MIN_VALUE;
		int sec_highest = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > hightest) {
				sec_highest = hightest;
				hightest = arr[i];
			}
			if(arr[i] != hightest && arr[i] > sec_highest) {
				sec_highest = arr[i];
			}
		}
		
		System.out.println("Highest Element: "+ hightest);
		System.out.println("Second Highest: "+sec_highest);
		
		//========================Java 8 stream API ========================================
		// this is for list
		int firstHighest = ll.stream().distinct().sorted((o1, o2) -> o2-o1).findFirst().get();
		int secondHighest = ll.stream().distinct().sorted((o1, o2) ->o2-o1 ).skip(1).findFirst().get();
		int thirdHighest = ll.stream().distinct().sorted((o1, o2) ->o2-o1 ).skip(2).findFirst().get();
		System.out.println("1st Using stream: "+firstHighest);
		System.out.println("2st Using stream: "+secondHighest);
		System.out.println("3rd Using stream: "+thirdHighest);
		
		
		// this is for array
		int firstHighestArray = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).findFirst().get();
		int secondHighestArray = Arrays.stream(arr).boxed().distinct().sorted((o1, o2) -> o2-o1).skip(1).findFirst().get();
		System.out.println("1st Using stream in array: "+firstHighestArray);
		System.out.println("2st Using stream in array: "+secondHighestArray);
		
	}
}
