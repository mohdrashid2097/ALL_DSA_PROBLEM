package StreamQuestion;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class DuplicateInList {

	public static void main(String[] args) {
		
		HashSet<Integer> hs1 = new HashSet<>();
		System.out.println(hs1.add(1));
		System.out.println(hs1.add(1));
		List<Integer> ll = Arrays.asList(4,5,6,7,8,9,4,5,6);
		HashSet<Integer> hs = new HashSet<>();
		List<Integer> res = ll.stream().filter(e->!hs.add(e)).collect(Collectors.toList());
		System.out.println(res);
		System.out.println();

		
		// find frquency of element
		List<Integer> itemslist = Arrays.asList(10, 12, 10, 10, 33, 40, 40, 61, 61);
		itemslist.stream().filter(element -> Collections.frequency(itemslist, element) > 1).forEach(System.out::println);
		long count = itemslist.stream().filter(element -> Collections.frequency(itemslist, element) > 1).count();
		System.out.println(count);
		
		// duplicate element
		Set<Integer> dupElement = itemslist.stream().filter(element -> Collections.frequency(itemslist, element) > 1).collect(Collectors.toSet());
		System.out.println(dupElement);
	}

}
