package StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalClassesQuestionNotes {

	public static void main(String[] args) {
		
		//Example1
		//What is the Optional class in Java 8? Why is it used?
		//Answer: Optional is a container object used to represent a value that may or may not be present (to avoid null checks and NullPointerException).
		Optional<String> val=Optional.ofNullable("Hello Optional Classes");
		//val.ifPresent(System.out::println);
		
		//Example2
		//2. How do you create an Optional instance?
		//	Answer: You can create an Optional in three ways:
		//		Optional.of(value): Creates an Optional with a non-null value.
		//		Optional.ofNullable(value): Creates an Optional that may be null.
		//		Optional.empty(): Creates an empty Optional.
		Optional<String> opt1 = Optional.of("hello");       // Non-null
		Optional<String> opt2 = Optional.ofNullable(null);  // value may be Nullable
		Optional<String>  opt3 = Optional.empty();           // Empty	
		
		//Example3
		//3. How to use Optional to avoid NullPointerException?
		// Answer: Use Optional methods like ifPresent, orElse, orElseGet, and orElseThrow to handle values safely.
		Optional<String> optional3 = Optional.ofNullable(null);
		String res3 = optional3.orElse("Default Value");
		//System.out.println(res3);
		
		//Example4
		//4. What is the difference between orElse and orElseGet?
		//  orElse: Always evaluates the fallback value, even if the Optional contains a value.
		//  orElseGet: Evaluates the fallback value lazily, only when the Optional is empty.
		
		String name = null;
		Optional<String> opt4 = Optional.ofNullable(name);
		
		// orElse: Always evaluates
		// String res4 = opt4.orElse(getDefaultName());
		
		// orElseGet: Lazily evaluates
		//  String res4_1 = opt4.orElseGet(() -> getDefaultName());
		
		//Example5
		// 5. How to check if an Optional has a value?
		// Answer: Use the isPresent() or ifPresent() method.
		
		Optional<String> opt5 = Optional.ofNullable("Hello");
		if(opt5.isPresent()) {
			//System.out.println(opt5.get());
		}
		
		//Example6
		//6. How to use map and flatMap with Optional?
		// map: Transforms the value if present.
		// flatMap: Similar to map, but avoids wrapping nested Optional values.
		
		Optional<String> opt6 = Optional.ofNullable("helloe");
		//Using map
		Optional<Integer> length = opt6.map(String::length);
		//System.out.println("Length of string: "+ length.get());
		
		// Using flatMap
		Optional<Optional<String>> nestedOptional = Optional.of(Optional.of("nested"));
		Optional<String> flatMapped = nestedOptional.flatMap(o->o);
		//flatMapped.ifPresent(System.out::println);
		
		//Example7
		// 7. How to throw an exception if Optional is empty?
		// Answer: Use orElseThrow() to throw an exception.
		
		Optional<String> opt7 = Optional.ofNullable(null);
		// Throws NoSuchElementException
		//String value = opt7.orElseThrow(()-> new IllegalArgumentException("Value is missing"));
		//System.out.println(value);


		
		//Example8
		//  8. What is the purpose of filter in Optional?
		//  Answer: filter is used to conditionally retrieve the value based on a predicate.
		
		Optional<String> opt8 = Optional.ofNullable("hello");
		Optional<String> value8 = opt8.filter(value -> value.startsWith("h"));
		//value8.ifPresent(System.out::println);
		
		//Example9
		// 9. Can Optional be used with streams?
		// Answer: Yes, Optional integrates well with Java 8 Streams.
		
		List<String> ll = Arrays.asList("hello","hi","delhi","kichha","kichha");
		Optional<String> firstNameWithA = ll.stream().filter(word -> word.startsWith("d")).findFirst();
		//firstNameWithA.ifPresent(System.out::println);
		Optional<List<String>> ll9 = Optional.ofNullable(ll.stream().filter(word -> word.startsWith("h")).collect(Collectors.toList()));
		//ll9.ifPresent(System.out::println);
		
		
		// Example10
		// 10. What are the limitations of Optional?
			//	Answer:
			//	Not meant to replace all null checks everywhere.
			//	Overuse can lead to unnecessary overhead.
			//	Cannot be serialized directly without additional effort.
			//	Should not be used in class fields or method parameters.
		
		
	}

}
