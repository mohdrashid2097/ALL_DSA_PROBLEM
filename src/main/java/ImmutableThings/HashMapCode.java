package ImmutableThings;

import java.util.*;

public class HashMapCode {
	
	public static class HashMap<K,V>{
		
		//this is the structure of linkedlist node
		private class Node{
			K key;
			V value;
			public Node(K key, V value) {
				this.key = key;
				this.value = value;
			}
			
		}
		
		
		private int n; // n-> total number of nodes
		private int N; // N-> total number of bucket
		private LinkedList<Node> buckets[];  // N = bucket.length;
		
		public HashMap(){
			this.N = 4;
			this.buckets = new LinkedList[N];
			for(int i=0;i<N;i++) {
				buckets[i] = new LinkedList<>();
			}
		}
		
		// this is for to get hashcode
		private int hashFunction(K key) { // Value always 0 --N
			int bi = key.hashCode();
			// hashcode can be negative or positive-> need positive
			// bucket index should be lie 0-N ,,, we have take remainder
			return Math.abs(bi)%N;
		}
		
		// this is for to search element in linkedList
		private int searchInLL(K key, int bi) {
			LinkedList<Node> ll = buckets[bi];
			for(int i=0;i<ll.size();i++) {
				if(ll.get(i).key == key) {
					return i;
				}
			}
			
			return -1;
		}
		
		//this is for rehashing
		private void rehash() {
			LinkedList<Node> oldBuckets[] = buckets;
			buckets = new LinkedList[N*2];
			for(int i=0;i<N*2;i++) {
				buckets[i] = new LinkedList<>();
			}
			for(int i=0;i<oldBuckets.length;i++) {
				LinkedList<Node> ll = oldBuckets[i];
				for(int j=0;j<ll.size();j++) {
					Node node = ll.get(j);
					put(node.key,node.value);
				}
			}
			
		}
		public void put(K key, V value) {
			int bi = hashFunction(key);    // get hash vale from this function
			int di = searchInLL(key, bi);  // check whether the value exist(di) or not(-1)
			
			if(di == -1) {     // if key does not exist
				buckets[bi].add(new Node(key,value));
				n++;
			}
			else {   // if key exist
				Node data = buckets[bi].get(di);
				data.value = value;    // updating value here
			}
			
			double lambda = (double)n/N;
			if(lambda >2.0) {
				// rehashing
				rehash();
			}
			
		}
		
		//this is for get function
		public V get(K key) {
			int bi = hashFunction(key);    // get hash vale from this function
			int di = searchInLL(key, bi);  // check whether the value exist(di) or not(-1)
			
			if(di == -1) {     // if key does not exist
				return null;
			}
			else {   // if key exist
				Node data = buckets[bi].get(di);
				return data.value;
			}
		}
		
		public boolean containsKey(K key) {
			int bi = hashFunction(key);    // get hash vale from this function
			int di = searchInLL(key, bi);  // check whether the value exist(di) or not(-1)
			
			if(di == -1) {     // if key does not exist
				return false;
			}
			else {   // if key exist
				return true;
			}
			
		}
		
		public V remove(K key) {
			int bi = hashFunction(key);    // get hash vale from this function
			int di = searchInLL(key, bi);  // check whether the value exist(di) or not(-1)
			
			if(di == -1) {     // if key does not exist
				return null;
			}
			else {   // if key exist
				Node node = buckets[bi].remove(di);
				n--;
				return node.value;
			}
		}
		
		public boolean isEmpty() {
			return n==0;
		}
		
		public ArrayList<K> keySet(){
			ArrayList<K> keys = new ArrayList<>();
			for(int i=0;i<buckets.length;i++) {  //this bucket index --bi
				LinkedList<Node> ll = buckets[i];
				for(int j=0;j<ll.size();j++) {
					Node node = ll.get(j);
					keys.add(node.key);
				}
			}
			return keys;
		}
		
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("India", 140);
		map.put("Nepali", 120);
		map.put("UK", 150);
		map.put("USA", 200);
		System.out.println(map.get("UK"));
		
	}

}
