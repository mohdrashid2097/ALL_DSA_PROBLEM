package LeedCode75Question;

import java.util.HashMap;
import java.util.Map;

class Node{
	int key;
	int value;
	Node next;
	Node prev;
	Node(int key,int value){
		this.key = key;
		this.value = value;
		next = null;
		prev = null;
	}
}

public class LRUCache {
	
	private int capacity;
	private Map<Integer, Node> cacheMap;
	private Node head;
	private Node tail;
	
	LRUCache(int capacity){
		this.capacity=capacity;
		this.cacheMap = new HashMap<Integer, Node>();
		this.head = new Node(-1,-1);
		this.tail = new Node(-1,-1);
		this.head.next = this.tail;
		this.tail.prev = this.head;
	}
	
	// this is for put operation - insertion and updation
	void put(int key, int value) {
		if(cacheMap.containsKey(key)) {
			Node oldNode = cacheMap.get(key);
			remove(oldNode);
		}
		
		Node newNode = new Node(key,value);
		cacheMap.put(key, newNode);
		add(newNode);
		
		if(cacheMap.size() > capacity) {
			Node nodeToDelete = tail.prev;
			remove(nodeToDelete);
			cacheMap.remove(nodeToDelete.key);
		}
	}
	
	void remove(Node node) {
		Node nextNode = node.next;
		Node prevNode = node.prev;
		prevNode.next = nextNode;
		nextNode.prev = prevNode;
	}
	
	void add(Node node) {
		Node nextNode = head.next;
		head.next = node;
		node.prev = head;
		node.next = nextNode;
		nextNode.prev = node;
	}
	
	// this is for get/ retrieve opeartion
	int get(int key) {
		
		if(!cacheMap.containsKey(key)) {
			return -1;
		}
		
		Node node = cacheMap.get(key);
		remove(node);
		add(node);
		
		return node.value;
		
	}
	

	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1);
		lRUCache.put(2, 2);
		System.out.println(lRUCache.get(1));
		System.out.println(lRUCache.get(3));
		lRUCache.put(3, 3);
		System.out.println(lRUCache.get(2));
		System.out.println(lRUCache.get(3));
		

	}

}
