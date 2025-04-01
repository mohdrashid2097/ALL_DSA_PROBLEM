package LinkedList;

public class DoublyLinkedlistInsertion {
	Node head;
	class Node{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data = d;
			next = null;
			prev = null;
		}
	}
	
	public void pushAtFront(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
	}
	
	public void insertAfter(Node prev_node, int new_data) {
		if(prev_node == null) {
			System.out.println("Prev_node is null :");
			return;
		}
		
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		new_node.prev = prev_node;
		if(new_node.next != null) {
			new_node.next.prev = new_node;
		}
		
	}
	public void insertBefore(Node next_node, int new_data) {
		if(next_node == null) {
			System.out.println("Prev_node is null :");
			return;
		}
		
		Node new_node = new Node(new_data);
		new_node.prev = next_node.prev;
		next_node.prev = new_node;
		new_node.next = next_node;
		
		if(new_node.prev != null) {
			new_node.prev.next = new_node;
		}
		else {
			head = new_node;
		}
		
		
	}
	
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		if(head == null) {
			head = new_node;
			return;
		}
		
		while(last.next != null) {
			last = last.next;
		}
		
		last.next = new_node;
		new_node.prev = last;
	}
	
	public void printDlList(Node head) {
		Node last = null;
		System.out.println("Traverse in forward direction :");
		while(head != null) {
			System.out.print(head.data+" ");
			last = head;
			head = head.next;
		}
		
		System.out.println();
		System.out.println("Traverse in backward direction :");
		
		while(last != null) {
			System.out.print(last.data+" ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		DoublyLinkedlistInsertion dl = new DoublyLinkedlistInsertion();
		//dl.pushAtFront(1);
		//dl.pushAtFront(2);
		//dl.pushAtFront(3);
		//dl.pushAtFront(4);
		//dl.pushAtFront(5);
		//dl.insertAfter(dl.head.next.next, 10);
		//dl.insertBefore(dl.head.next.next.next, 12);
		dl.append(10);
		dl.append(11);
		dl.append(12);
		dl.append(13);
		dl.append(14);
		dl.append(15);
		System.out.println("Print Doubly Linked List :");
		dl.printDlList(dl.head);
	}
}
