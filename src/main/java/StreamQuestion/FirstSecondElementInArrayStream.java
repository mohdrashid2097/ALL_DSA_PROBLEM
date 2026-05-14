package StreamQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FirstSecondElementInArrayStream {

	public static void main(String[] args) {
		// random numbers
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        
        // 2ndLowest element
        int secondLowestElemet = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        //System.out.println("2ndLowestElement: "+secondLowestElemet);

        Arrays.sort(numbers);
        //System.out.println("Sorted Array: "+Arrays.toString(numbers));
        
        //3rd lowest element
        int thirdLowestLement = Arrays.stream(numbers).sorted().skip(2).findFirst().getAsInt();
        //System.out.println("3rd Lowest Element: "+thirdLowestLement);
        
        //===2ndHighest element
        int[] num = {5, 9, 11, 2, 8, 21, 1};
        int secondHighestElement = Arrays.stream(num).boxed().sorted((o1, o2) ->o2-o1 ).skip(1).findFirst().get();
        //System.out.println("2nd Highest Element: "+secondHighestElement); 
        
        // use of Partition
        List<Integer> num1 = Arrays.asList(12, 7, 5, 8, 19, 22, 9, 2);

        // Partition into even and odd numbers
        Map<Boolean, List<Integer>> partitioned = num1.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);

//        System.out.println("Even Numbers: " + evenNumbers);
//        System.out.println("Odd Numbers: " + oddNumbers);
        
        Map<Boolean,Integer> evenOddSum = num1.stream().collect(Collectors.partitioningBy(
        		n->n%2==0, Collectors.summingInt(Integer::intValue)));
        //System.out.println("Even Numbers Sum: " + evenOddSum.get(true));
        //System.out.println("Odd Numbers Sum: " + evenOddSum.get(false));
        
        Map<String,Integer> evenOddSumByGroupby = num1.stream().collect(Collectors.groupingBy(
        		n->n%2==0?"Even":"Odd", Collectors.summingInt(Integer::intValue)
        		));
        //System.out.println("Even Numbers Sum By GroupBy: " + evenOddSumByGroupby.get("Even"));
        //System.out.println("Odd Numbers Sum By GroupBy: " + evenOddSumByGroupby.get("Odd"));
        
        //Collect even and odd number
        
        Map<String,List<Integer>> evenOddList = num1.stream().collect(Collectors.groupingBy(
        		n->n%2==0?"Even":"Odd", Collectors.toList()
        		));
        System.out.println("Even Numbers Sum By GroupBy: " + evenOddList.get("Even"));
        System.out.println("Odd Numbers Sum By GroupBy: " + evenOddList.get("Odd"));
	}
}
