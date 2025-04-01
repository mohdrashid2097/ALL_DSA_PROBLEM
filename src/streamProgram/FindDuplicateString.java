						package streamProgram;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class FindDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> ll = Arrays.asList(1,2,3,4,5,6,1,2,3);
		// find the frequency
		Map<Integer,Long> mapFreq = ll.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(mapFreq);
		
		//find the duplicate
		Map<Integer,List<Integer>> collectDuplicate = ll.stream().collect(Collectors.groupingBy(e->e));
		System.out.println(collectDuplicate);
		collectDuplicate.entrySet().forEach(e->{
			if(e.getValue().size() > 1) {
				System.out.print(e.getKey()+" ");
			}
		});
		System.out.println();
		//find duplicate
		List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> l2 = Arrays.asList(3,4,5,6);
		l1.forEach(e->{
			if(l2.contains(e)) {
				System.out.print(e+" ");
			}
		});
		
		System.out.println();
		// convert char array into string
		char[] arr = {'M','o','h','d','R','a','s','h','i','d'};
		String str = Stream.of(arr).map(e->new String(e)).collect(Collectors.joining(""));
		System.out.println(str);
		char[] ch = { 'G', 'e', 'e', 'k', 's', 'f', 'o','r', 'G', 'e', 'e', 'k', 's' };
		String arrayString = Stream.of(ch).map(String::valueOf).collect(Collectors.joining());
		System.out.println("Arrays String :"+arrayString);
		String arrayString1 = Stream.of(ch).map(e->new String(e)).collect(Collectors.joining());
		System.out.println("Arrays String :"+arrayString1);
		
		//String of arrays
		List<String> strLL = Arrays.asList("Hello","Mohd","Rashid");
		String strLLoutput = strLL.stream().collect(Collectors.joining());
		System.out.println("strLLoutput : "+strLLoutput);
		
		// Reverse String in-place
		String str1 = "Hello.Kichha.City";
		String str1Output = Stream.of(str1.split("[.]")).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(str1Output); //olleH ahhciK ytiC
		  
		String str2 = "Hello.Kichha.City";
		String str2Output = Arrays.stream(str1.split("[.]")).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(str2Output); //olleH ahhciK ytiC
		
		// reverse strings
		String str3 = "Hello Kichha City";
		String str3Output = Stream.of(str3).map(e->new StringBuilder(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(str3Output); //ytiC ahhciK olleH
				

	}

}
