package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(1, map.getOrDefault(1, 0) +1);

		System.out.println(map);

	}

}
