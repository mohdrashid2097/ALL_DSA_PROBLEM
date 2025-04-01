package streamProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<String>();
		ll.add("Mohd"); ll.add("hid"); ll.add("Rohit"); ll.add("mohit"); ll.add("roshan"); ll.add("cheetah");
		
		List<String> resll = ll.stream().filter(e->(e.length()%3)==0 || (e.length()%4)==0).collect(Collectors.toList());
		StringJoiner strJoiner = new StringJoiner("-");
		
		resll.forEach(e->strJoiner.add(e));
		
		//System.out.println(ll);
		//System.out.println(resll);
		//System.out.println(strJoiner);
		
		// 2nd example with prefix and sufffix
		StringJoiner str2 = new StringJoiner(",","[","]");
		str2.add("Hello");
		str2.add("Mohd");
		str2.add("Rashid");
		//System.out.println("StringJoiner with Prefix and Suffix [ ]: "+str2);
		
		// 3rd example with prefix and suffix
		StringJoiner str3 = new StringJoiner(",","{","}");
		str3.add("Hello");
		str3.add("Mohd");
		str3.add("Rashid");
		//System.out.println("With { } :"+str3);
		
		//merge two stringJoiner 
		str2.merge(str3);       //merging str3 into str2
		System.out.println("Merging str3 into str2: "+str2);
		
		List<String> name = List.of("I","am","doing","great");
		StringJoiner str4 = new StringJoiner(",");
		name.forEach(l->str4.add(l));
		System.out.println("Convert List into StringJoiner: "+str4);
		
		//How to handle an empty StringJoiner without prefix/suffix issues?
		//→ Use .setEmptyValue("Default") to avoid an empty output.
		
		StringJoiner emptyStr = new StringJoiner(",","[","]");
		emptyStr.setEmptyValue("No Element");
		System.out.println("Empty StringJoiner: "+emptyStr);
	}
}
