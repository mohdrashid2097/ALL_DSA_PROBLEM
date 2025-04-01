package StreamQuestion;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class CountFrequncyStr {

	public static void main(String[] args) {
		
		String str ="MohdRashid";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		// use of entrySet() method in map.....
		int ans=0;
		for(Map.Entry<Character, Integer> mp:map.entrySet()) {
			if(mp.getValue()==1) {
				ans++;
			}
		}
		System.out.println(ans);
		
		// use of keySet() method in map.......
		int ans1=0;
		for(Character keyset:map.keySet()) {
			if(map.get(keyset)==1) {
				ans1++;
			}
		}
		System.out.println("keyset Answer1: "+ans1);
		
		// use of values() method in map......
		int ans2=0;
		for(Integer value:map.values()) {
			if(value == 1) {
				ans2++;
			}
		}
		System.out.println("Value Answer2: "+ans2);
		
		//===============Using Stream======================
		Map<Character,Long> mapOutput = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));		
		long ansStream = mapOutput.entrySet().stream().filter(e->e.getValue()==1).count();
		System.out.println("ansStream : "+ansStream);
		
		// use of limit in stream
		int[] arr = {1,2,3,4,5,6,7,8,9};
		Arrays.stream(arr).limit(5).forEach(System.out::print);
		
	}

}