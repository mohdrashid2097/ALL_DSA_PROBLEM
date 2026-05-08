package StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeTwoUnSortedArray {

	public static void main(String[] args) {
		int[] arr1 = {2,3,5,8,9};
		int[] arr2 = {8,9,4,2,1,0,8};
		int[] arr3 = {8,9,4,2,1,0,8,100};
		int[] res = Stream.of(arr1,arr2,arr3).flatMapToInt(Arrays::stream).distinct().sorted().toArray();
		System.out.println(Arrays.toString(res));
		
		List<Integer> ll1 = Arrays.asList(2,3,5,8,9);
		List<Integer> ll2 = Arrays.asList(8,9,4,2,1,0,8);
		List<Integer> ll3 = Arrays.asList(8,9,4,2,1,0,8);
		List<Integer> resll = Stream.concat(ll1.stream(), ll2.stream()).sorted().toList();
		System.out.println("List: "+resll);
		List<Integer> resll2 = Stream.of(ll1,ll2).flatMap(l->l.stream()).sorted().collect(Collectors.toList());
		System.out.println("resll2 :"+resll2);

	}

}
