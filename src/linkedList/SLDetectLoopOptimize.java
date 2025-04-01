package linkedList;

import linkedList.SLDetectLoop.Node;

public class SLDetectLoopOptimize {
	Node head;
	public class Node {
		int data;
		int flag;
		Node next;
		Node(int d){
			data = d;
			flag = 0;
			next = null;
		}
	}

	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
		
	}
	
	public boolean detectLoop(Node h) {
		while(h != null) {
			if(h.flag == 1) {
				return true;
			}
		    h.flag = 1;
		    h = h.next;
			
		}
		return false;
	}
	public static void main(String[] args) {
		SLDetectLoopOptimize ll = new SLDetectLoopOptimize();
		ll.push(20);
		ll.push(4);
		ll.push(15);
		ll.push(10);
		ll.printList();
		ll.head.next.next.next.next = ll.head;
		System.out.println();
		System.out.println(ll.detectLoop(ll.head));
	

	}

}
