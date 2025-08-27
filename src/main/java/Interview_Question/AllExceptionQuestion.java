package Interview_Question;

import java.util.HashMap;
import java.util.Map;

public class AllExceptionQuestion {

	public static void main(String[] args) {
		
		//Here are 10 common scenarios where NullPointerException occurs:
		
		//1. Calling a method on a null object
		String str = null;
		str.length(); // NPE
		//You're trying to invoke length() on a null reference.
		
		//2. Accessing a field on a null object
		class Person {
		    String name;
		}
		Person p = null;
		System.out.println(p.name); // NPE
		//You're accessing a field on a null object.
		
		//3. Using a null object in a method call
		//public static void printLength(String s) {
		//    System.out.println(s.length()); // NPE if s is null
		//}
		//printLength(null);
		
		//4. Comparing strings with .equals() on a null object
		//String str = null;
		if (str.equals("abc")) { // NPE
		}
		//Safer way: "abc".equals(str)
		
		System.out.println("abc".equals(null)); // return false
		
		//5. Autoboxing null values
		Integer num = null;
		int val = num; // NPE due to unboxing
		//Unboxing null to a primitive throws an exception.
		
		//6. Accessing array elements from a null array
		int[] arr = null;
		int val1 = arr[0]; // NPE
		
		//8. Synchronizing on a null object
		Object lock = null;
		synchronized(lock) {  // NPE
		    // ...
		}
		
		//10. Null values in collections
		Map<String, String> map = new HashMap();
		map.put("key", null);
		System.out.println(map.get("key").length()); // NPE
		//Even if the key exists, the value might be null.
		
		
		


	}

}
