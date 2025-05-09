package GeneralProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestProgram {

	public static void main(String[] args) {
		
		//List<Integer> ll1 = Arrays.asList(1,2,3);
		//ll1.add(4);
		//System.out.println(ll1); // throw error
		
		List<Integer> ll2 = new ArrayList<Integer>();
		ll2.add(4);
		System.out.println(ll2);
		
		//List<Integer> ll3 = List.of(1,2);
		//ll3.add(4);
		//System.out.println(ll3); // throw error
		
		System.out.println(0.1*1==0.1);
		System.out.println(0.1*2==0.2);
		System.out.println(0.1*3==0.3);
		System.out.println(0.1*4==0.4);
		System.out.println(0.1*5==0.5);
		
		// need to add in string questions list
		String str = "hello kichha rudrapura";
		String ans = Arrays.stream(str.split(" ")).map(word -> word.substring(0,1).toUpperCase() +word.substring(1))
				.collect(Collectors.joining(" "));
		System.out.println("Answer: "+ans);
	}

}
