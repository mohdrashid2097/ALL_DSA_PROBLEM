package StreamQuestion;

import java.util.Arrays;


public class FirstSecondElementInArrayStream {

	public static void main(String[] args) {
		// random numbers
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        
        // 2ndLowest element
        int secondLowestElemet = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();
        System.out.println("2ndLowestElement: "+secondLowestElemet);

        Arrays.sort(numbers);
        System.out.println("Sorted Array: "+Arrays.toString(numbers));
        
        //3rd lowest element
        int thirdLowestLement = Arrays.stream(numbers).sorted().skip(2).findFirst().getAsInt();
        System.out.println("3rd Lowest Element: "+thirdLowestLement);
        
        //===2ndHighest element
        int[] num = {5, 9, 11, 2, 8, 21, 1};
        int secondHighestElement = Arrays.stream(num).boxed().sorted((o1, o2) ->o2-o1 ).skip(1).findFirst().get();
        System.out.println("2nd Highest Element: "+secondHighestElement);   
	}
}
