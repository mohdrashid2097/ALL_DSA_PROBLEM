package Iterator_MultiThreading_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe_Iterator {

	public static void main(String[] args) {
		// This is a example of Fail safe iterator
		
		//List<String> ll = new ArrayList<String>();                            //fail fast iterator 
		CopyOnWriteArrayList<String> ll = new CopyOnWriteArrayList<String>();   //fail safe iterator
		ll.add("a");
		ll.add("b");
		ll.add("c");
		
		Iterator<String> iterator = ll.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
			
			ll.add("Safe To Modify Content");
		}
		
		System.out.println("ArrayList after Modification: "+ll);

	}

}
