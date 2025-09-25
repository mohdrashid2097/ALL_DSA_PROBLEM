package StreamQuestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringStreamQuestions {

	public static void main(String[] args) {
		
		//1. Count the frequency of each character in a string
		String input = "interview";
		Map<Character,Long> freqOfChar = input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
				c->c,Collectors.counting()));
		//System.out.println("Frequency Of character: "+freqOfChar);
		
		//2. Check if a string is a palindrome
		String input2 = "madam";
		boolean isPalindrome = IntStream.range(0, input2.length()/2).allMatch( i-> input2.charAt(i)==input2.charAt(input2.length()-i-1));
		//System.out.println("IsPalindrome: "+ isPalindrome);
		
		//3. Find duplicate characters in a string
		String input3 = "programming";
		Set<Character> findDuplicateChar = input3.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
				.entrySet().stream().filter(entry-> entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toSet());
		//System.out.println("Duplicate Character: "+findDuplicateChar);
		
		//4. Reverse a string using Stream API
		String input4 = "stream";
		String resverse = Stream.of(input4).map(e-> new StringBuilder(e).reverse()).collect(Collectors.joining());
		//System.out.println("Reverse: "+resverse);
		
		//5. Count vowels and consonants in a string
		String input5 = "example";
		long vowels = input5.chars().mapToObj(c-> (char)c).filter(c->"AEIOUaeiou".indexOf(c) !=-1).count();
		//System.out.println("Count of Vowels: "+vowels);
		long consonant = input5.chars().mapToObj(c ->(char)c).filter(c -> "AEIOUaeiou".indexOf(c) ==-1).count();
		//System.out.println("Count of Consonant: "+consonant);
		
		//6. Find the first non-repeating character in a string
		String input6 = "swiss";
		Character firstNonRepeating = input6.chars().mapToObj(c -> (char)c).filter(c-> input6.indexOf(c) == input6.lastIndexOf(c)).findFirst().orElse(null);
		//System.out.println("firstNonRepeating: "+firstNonRepeating);
		
		//7. Remove duplicate characters from a string
		String input7 = "programming";
		String removeDupChar = input7.chars().mapToObj( c->String.valueOf((char)c)).distinct().collect(Collectors.joining());
		//System.out.println("remove duplicate character: "+removeDupChar);
		
		//8. Sort characters in a string
		String input8 = "stream";
		String sortChar = input8.chars().sorted().mapToObj(c-> String.valueOf((char)c)).collect(Collectors.joining());
		//System.out.println("sort character in string: "+sortChar);
		
		//9. Count words in a sentence
		String sentence = "Java Stream API is powerful";
		long countWord = Arrays.stream(sentence.split(" ")).count();
		//System.out.println("Cunt words: "+countWord);
		
		//10. Find the longest word in a sentence
		String sentence1 = "Stream API is awesome";
		String longestWord = Arrays.stream(sentence1.split(" ")).max(Comparator.comparingInt(String::length)).orElse("");
		//System.out.println("Longest word: "+longestWord);
		
		//11. Find all substrings of a string
		String input11 = "abc";
		List<String> allSubString = IntStream.range(0, input11.length()).boxed()
				.flatMap(i -> IntStream.range( i+1, input11.length() + 1 ).mapToObj(j->input11.substring(i,j))).collect(Collectors.toList());
		//System.out.println("All sub string: "+allSubString);
		
		//12. Join a list of strings into a single string
				List<String> words = Arrays.asList("Java", "Stream", "API");
				String singleStr = String.join("", words);
				//System.out.println("Single String: "+singleStr);
				String singleStr1 = words.stream().map(str->str).collect(Collectors.joining());
				//System.out.println("Single String1: "+ singleStr1);
				
	   //13. Count the occurrences of each word in a sentence
		  String sentence13 = "Java is fun and Java is powerful";		
		  Map<String,Long> occurrences = Arrays.stream(sentence13.split(" ")).collect(
				  Collectors.groupingBy(word->word, Collectors.counting()));
		  //System.out.println("Count the occurrence of each character: "+ occurrences);
		  
	   //14. Convert a string to uppercase or lowercase
		  String input14 = "java";
		  String upperChar = input14.chars().mapToObj(c->(char)c).map(Character::toUpperCase).map(c->String.valueOf(c)).collect(Collectors.joining());
		  //System.out.println("UpperCase: "+upperChar);
		  
		  String input15 = "BTYEDNCE";
		  String smallChar = input15.chars().mapToObj(c->(char)c).map(Character::toLowerCase).map(String::valueOf).collect(Collectors.joining());
		  //System.out.println("Lower case: "+smallChar);
		  
		  //15. Split a string into a list of characters
		  String input16 = "stream";
		  List<Character> listChar = input16.chars().mapToObj( c-> (char)c).collect(Collectors.toList());
		  //System.out.println("List of character: "+listChar);
		  
		  //16. Find all anagrams of a word in a list of strings
		  String target = "listen";
		  List<String> listwordstr = Arrays.asList("enlist", "google", "inlets", "banana");
		  List<String> anagrams = listwordstr.stream()
				    .filter(word -> word.length() == target.length() &&
				        word.chars().sorted().boxed().collect(Collectors.toList())
				            .equals(target.chars().sorted().boxed().collect(Collectors.toList())))
				    .collect(Collectors.toList());
		  
		  //System.out.println("All the anagrams: "+anagrams);
		  
		  String[] str1 = {"Hello","mohd rashid"};
		  List<String> ansStr = Arrays.stream(str1).flatMap(str -> Arrays.stream(str.split(" ")))
				  .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
				  .collect(Collectors.toList());
		  //System.out.println("Answer_Str: "+ansStr);
		  
		  //17 You can filter out the strings containing digits using Java 8 Streams and a regex.
		  List<String> strWithDigit = Arrays.asList("aa", "aa23bb", "vv", "bb", "g3g");
		  List<String> resStrWithDigit = strWithDigit.stream().filter( s -> s.matches(".*\\d.*")).collect(Collectors.toList());
		  //System.out.println("ResStrWithDigit: "+resStrWithDigit);
		  List<String> resStrWithoutDigit = strWithDigit.stream().filter( s -> !s.matches(".*\\d.*")).collect(Collectors.toList());
		  //System.out.println("ResStrWithoutDigit: "+resStrWithoutDigit);
		  
	}

}
