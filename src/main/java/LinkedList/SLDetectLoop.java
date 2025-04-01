package LinkedList;

import java.util.HashSet;



public class SLDetectLoop {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public boolean detectLoop(Node h) {
		HashSet<Node> set = new HashSet<Node>();
		while(h != null) {
			if(set.contains(h)) {
				return true;
			}
			
			set.add(h);
			h = h.next;
		}
		
		return false;
	}
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
		
	}

	public static void main(String[] args) {
		SLDetectLoop ll = new SLDetectLoop();
		ll.push(20);
		ll.push(4);
		ll.push(15);
		ll.push(10);
		ll.printList();
		// create loop
		ll.head.next.next.next.next = ll.head;
		System.out.println();
		System.out.println(ll.detectLoop(ll.head));
	}

}
