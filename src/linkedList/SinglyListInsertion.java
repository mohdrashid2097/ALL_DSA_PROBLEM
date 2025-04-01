package linkedList;

public class SinglyListInsertion {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
	}
	
	public void pushAtfront(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	public void insertAfter(Node prev_node,int new_data) {
		if(prev_node == null) {
			System.out.println("Privous node cannot be null :");
			return;
		}
		Node new_node = new Node(new_data);
		
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}
	
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.println(tNode.data);
			tNode = tNode.next;
		}
	}

	public static void main(String[] args) {
		SinglyListInsertion ll = new SinglyListInsertion();
		ll.append(5);
		ll.append(6);
		ll.append(7);
		ll.append(8);
		//ll.pushAtfront(10);
		//ll.pushAtfront(11);
		//ll.insertAfter(ll.head.next,8);
		//ll.insertAfter(ll.head,12);
		System.out.println("Print Singly Linked List :");
		ll.printList();
	

	}

}
