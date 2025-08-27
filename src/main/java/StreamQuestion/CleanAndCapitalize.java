package StreamQuestion;

import java.util.Arrays;

public class CleanAndCapitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = {"Hello1 a2", "kichh2gg 1hi yes"};
		String[] result = Arrays.stream(arr).map(s -> Arrays.stream(
							s.replaceAll("\\d","").split("\\s+"))
				.map(word->word.isEmpty()?"":Character.toUpperCase(word.charAt(0)) + word.substring(1))
				.reduce((a, b)->a+" "+b).orElse(""))
				.toArray(String[]::new);
		
		System.out.println("Result: "+Arrays.toString(result));
		String a = "Hello1 a2";
		System.out.println(a.replaceAll("\\d", ""));
		System.out.println(Arrays.toString(a.replaceAll("\\d", "").split("\\a+")));
							

	}

}
