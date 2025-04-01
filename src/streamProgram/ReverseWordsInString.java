package streamProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		//ways of creating list
		List<String> ll1 = new ArrayList<String>();
		List<String> ll2 = Arrays.asList("1","2");
		List<Integer> ll3 = List.of(1,2,3);
		
		// 1st way
		String str1 = "My.name.is.khan";
		List<String> words = Arrays.asList(str1.split("[.]"));
		Collections.reverse(words);
		String res1 = words.stream().collect(Collectors.joining("."));
		System.out.println("Result 1st way: "+res1);
		
		// 2nd way
		String str2 = "My name is khan";
		List<String> ll = Arrays.asList(str2.split(" "));
		String res2 = IntStream.rangeClosed(1, ll.size()).mapToObj(i->ll.get(ll.size()-i)).collect(Collectors.joining(" "));
		System.out.println("Result 2nd way: "+ res2 );
		
		// mapToObj:
		//Return Value : The function returns an object-valued Stream consisting of the results of applying the given function.
	}
}
