package StreamQuestion;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print series
		//Print series: 11, 12, 15, 20, 27
				
		String res0 = IntStream.range(0, 5).map(n->11 +n*n).mapToObj(String::valueOf).collect(Collectors.joining(", "));
		//System.out.println("Result :"+res0);
		List<Integer> res00 = IntStream.range(0, 5).mapToObj(n->11 + n*n).collect(Collectors.toList());
		//System.out.println("Result: "+res00);
		
		// List all the word starting with h
		List<String> ll1 = List.of("hello","how","yes","ok","okay","noida");
		List<String> res1 = ll1.stream().filter(word->word.startsWith("h")).toList();
		//System.out.println("Result 1: "+res1);
		
		List<String> res2 = ll1.stream().filter(word->word.matches("h.*")).toList();
		//System.out.println("Result 2: "+res2);
		
		//Extract number from the list of string
		List<String> ll2 = List.of("Order12","NoNumber","A55B","99");
		List<Integer> res3 = ll2.stream().map(word->word.replaceAll("\\D","")).filter(s-> !s.isEmpty()).map(Integer::valueOf).toList();
		//System.out.println("Result 3: "+res3);
		
		// remove special character from string and convert into word of list
		String text = "Java, Stream & Regex are powerful";
		List<String> res4 = Pattern.compile("\\W+").splitAsStream(text).toList();
		//System.out.println("Result 4 :"+res4);
		
		//it will give array of string
		String[] arr = text.split("\\W+");
		//System.out.println("Result Array : "+Arrays.toString(arr));
		
		//find the 2nd most repeated character in string
		String str = "aaaabbccddb";
		char res5 = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()))
				.entrySet().stream().sorted((c1,c2)->Long.compare(c2.getValue(), c1.getValue())).skip(1)
				.findFirst().get().getKey();
		System.out.println("2nd most repeated char: "+res5);
		
		//extract all the digit from the string
		String str1 = "abc123bb23jhg56bg7d8k9abc90k0";
		List<String> res6 = Pattern.compile("\\d+").matcher(str1).results().map(MatchResult::group).toList();
		//System.out.println("Result in String: "+res6);
		List<Integer> res7 = Pattern.compile("\\d+").matcher(str1).results().map(MatchResult::group)
				.map(Integer::valueOf).toList();
		//System.out.println("Result in Integer: "+res7);
		
		//Extract all the word starting with capital letter
		String str2 ="Alice met bob in New Your City";
		List<String> res8 = Pattern.compile("\\b[A-Z][a-zA-Z]*\\b").matcher(str2).results().map(MatchResult::group).toList();
		//System.out.println("All the word: "+res8);
		
		List<String> ll3 = List.of("abc","a1b","no","xyz78","nope");
		long res9 = ll3.stream().filter(word ->word.matches(".*\\d.*")).count();
		System.out.println("Word count : "+res9);
		
		//1️: Dot (.)
        //Meaning: Matches any single character
		//2️ Plus (+)
		//Meaning: One or more occurrences
		//3 Star (*)
		//Meaning: Zero or more occurrences
		//4 Question Mark (?)
		//Meaning: Zero or one occurrence
		//5 Square Brackets [ ]
		//Meaning: Match any one character inside
		
	}
}