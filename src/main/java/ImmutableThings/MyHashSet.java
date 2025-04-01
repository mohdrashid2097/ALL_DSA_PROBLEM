package ImmutableThings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MyHashSet {
	
	public static class HashSet<E>{
		
		private HashMap<E, Object> map;
		private Object PRESENT = new Object();
		
		HashSet(){
			map = new HashMap<>();
		}
		
		public boolean add(E e) {
			return map.put(e, PRESENT) == null;
		}
		
		public int size() {
			return map.size();
		}
		public boolean isEmpty() {
			return map.isEmpty();
		}
		public Iterator<E> iterator(){
			return map.keySet().iterator();
		}
		
	}

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(1);
		hs.add(2);
		System.out.println("Size: "+hs.size());
		System.out.println("IsEmpty: "+hs.isEmpty());
		

	}

}
