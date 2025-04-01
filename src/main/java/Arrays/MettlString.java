package Arrays;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MettlString {
	
	public static void find(String str) {
		
		
	
		int l = 0;
		int dis = Integer.MIN_VALUE;
		// to remove the space
		String str1 = str.replaceAll("\\s", "");
		for(int i=0;i<str1.length();i++) {
			
			if('a' == str1.charAt(i)) {
				dis = Math.max(dis, i-l);
				l = i;
			}
		}
		System.out.println("Distance : "+dis);
	}

	public static void main(String[] args) {
		
		String str = "my name is granar";
		find(str);
		
		//remove space
		String str1 = "my name is granar";
		String res = Stream.of(str1.split(" ")).map(e->new String(e)).collect(Collectors.joining());
		System.out.println("Removed space: "+res);
	}

}
