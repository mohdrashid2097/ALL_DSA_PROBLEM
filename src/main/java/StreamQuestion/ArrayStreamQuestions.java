package StreamQuestion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayStreamQuestions {
	

	public static void main(String[] args) {
		
		// two sums:
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int target1 = 7;
		Set<List<Integer>> res1 = Arrays.stream(numbers).boxed()
				.flatMap(x -> Arrays.stream(numbers).filter(y -> x+y==target1 && x<y).mapToObj(y-> List.of(x,y)))
				.collect(Collectors.toSet());
		
		System.out.println("Pairs sum: "+ res1);
		res1.forEach(res -> System.out.println(res));
		
		// triplet sum
		int[] num = {-1, 0, 1, 2, -1, -4};
		int target = 0;
		Set<List<Integer>> res = Arrays.stream(num)
				.boxed().flatMap(a -> Arrays.stream(num).boxed()
				.flatMap(b ->Arrays.stream(num)
				.filter(c -> a+b+c == target && a<b && b<c).mapToObj(c -> List.of(a,b,c))))
				.collect(Collectors.toSet());
		System.out.println("Triplet sum: "+res);
		res.forEach(re -> System.out.println(re));
	
	}

}
