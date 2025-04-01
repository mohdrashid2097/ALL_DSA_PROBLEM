package StreamQuestion;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamTerminalOperation {

	public static void main(String[] args) {
		//1. What are terminal operations in Java Streams?
		//Answer:
		//Terminal operations are the final operations in a Stream pipeline that produce a result 
		//(like a collection, value, or side effect) and consume the stream, making it unusable for further operations.
		
		List<Integer> ll = Arrays.asList(1,2,3,4,5,6);
		int sum1 = ll.stream().reduce(0, Integer::sum);
		Optional<Integer> sum2 = ll.stream().reduce((a,b)-> a+b);
		System.out.println("Sum1: "+ sum1+" : "+"Sum2: "+sum2.get());
		
		Optional<Integer> minNum = ll.stream().min(Integer::compareTo);
		Optional<Integer> maxNum = ll.stream().max(Integer::compareTo);
		
		System.out.println("MinNum: "+minNum.get()+" : "+"MaxNum: "+maxNum.get());
		
		boolean allEven = ll.stream().allMatch(n -> n%2==0); // Checks if all are even
		boolean allOdd = ll.stream().anyMatch(n -> n%2==0);  // Checks if any are even
		boolean noneNegative = ll.stream().noneMatch(n-> n< 0); // Checks if none are negative
		System.out.println("allEven: "+allEven+" : "+"allOdd: "+allOdd+" : "+" : "+"noneNegative: "+noneNegative);
		
		Map<Boolean,List<Integer> > p = ll.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println("Even number: "+p.get(true));
		System.out.println("Odd number: "+p.get(false));
		

	}

}
