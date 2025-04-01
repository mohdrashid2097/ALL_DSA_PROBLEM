package string;
import java.util.*;
public class PrintSubSequences {
	
	public static void findSubSequences(String s) {
		List<String> res = new ArrayList<>();
		findsubsequences(s,"",res);
		System.out.println(res);
	}
	
	public static void findsubsequences(String s,String ans,List<String> res) {
		
		if(s.length() == 0) {
			res.add(ans);
			return;
		}
		
		//take condition
		findsubsequences(s.substring(1),ans+s.charAt(0),res);
		
		// not take condition
		findsubsequences(s.substring(1),ans,res);
		
	}

	public static void main(String[] args) {
		String s = "abc";
		findSubSequences(s);

	}

}
