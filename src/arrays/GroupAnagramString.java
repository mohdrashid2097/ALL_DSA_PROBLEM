package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagramString {

	public static void main(String[] args) {
		
		String[] arr = {"cat", "dog", "tac", "god", "act"};
		List<String> ll = new ArrayList<>();
		Arrays.stream(arr).forEach(e->{
			char[] arr1 = e.toCharArray();
			Arrays.sort(arr1);
			ll.add(String.valueOf(arr1));
		});
	
	
	System.out.println(ll);
	
	System.out.println();
	}
	
	

}
