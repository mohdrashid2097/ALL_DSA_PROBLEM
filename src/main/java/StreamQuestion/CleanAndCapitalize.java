package StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CleanAndCapitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Hello1 a2", "kichh2gg 1hi yes"};
		String[] result = Arrays.stream(arr).map(s -> Arrays.stream(
							s.replaceAll("\\d","").split(" "))
				.map(word->word.isEmpty()?"":Character.toUpperCase(word.charAt(0)) + word.substring(1))
				.reduce((a, b)->a+" "+b).orElse(""))
				.toArray(String[]::new);
		
		System.out.println("Result: "+Arrays.toString(result));
		
		// store in List
		List<String> res1 = Arrays.stream(arr).map(s-> s.replaceAll("\\d", ""))
				.flatMap(word ->Arrays.stream(word.split(" ")))
				.filter(word -> !word.isEmpty())
				.map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
				.collect(Collectors.toList());
		System.out.println(res1);		
		
		
		
							

	}

}
