package dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Demo {

	public static void main(String[] args) {
		
		
		String str ="aaabbbccd";
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println(map);
		map.put(str.charAt(0), map.get('a') - 1);
		System.out.println(map);
	}

}
