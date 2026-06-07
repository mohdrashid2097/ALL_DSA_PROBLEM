package StreamQuestion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeateNonRepeateddCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "MohMohdRashid";
		Map<Character, Integer> map = new HashMap();
		
		// first non repeated character 'R'
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			if(str.indexOf(c) == str.lastIndexOf(c)) {
				System.out.println("Non Repeated Chracter: "+c);
				break;
			}
		}
		
		//Using stream api
		char nonRepeatedChar = str.chars().mapToObj(c->(char)c)
				.filter(c->str.indexOf(c) == str.lastIndexOf(c)).findFirst().get();
		System.out.println("Using Stream Non Repeated Char: "+nonRepeatedChar);
		
		// First Repeated character 
		for(int i=0;i<str.length();i++) {
			
			if(map.containsKey(str.charAt(i))) {
				System.out.println("First Repeated: "+str.charAt(i));
				break;
			}
			map.put(str.charAt(i), 1);
		}
		
		Set<Character> seen = new HashSet();
		char firstRepeatedChar = str.chars().mapToObj(c->(char)c)
				.filter(c->!seen.add(c)).findFirst().get();
		
		System.out.println("Using Stream First Repeated Char: "+firstRepeatedChar);

	}

}

