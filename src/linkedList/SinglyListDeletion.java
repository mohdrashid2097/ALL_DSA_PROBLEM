package linkedList;

public class SinglyListDeletion {
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
	
	public void deleteFromBegin() {
		 head = head.next;
		return;
	}
	public void deleteFromEnd() {
		Node end = head;
		Node prev = null;
		while(end.next != null) {
			prev = end;
			end = end.next;
		}
		prev.next = null;
	}
	public void deleteFromMiddle(int key) {
		Node temp = head, prev_node = null;
		
		if(temp != null && temp.data == key) {
			head = temp.next;
			return;
		}
		
		while(temp.next != null && temp.data != key) {
			
			prev_node = temp;
			temp = temp.next;
		}
		prev_node.next = temp.next;
		
	}
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}

	public static void main(String[] args) {
		SinglyListDeletion ll = new SinglyListDeletion();
		ll.append(5);
		ll.append(6);
		ll.append(7);
		ll.append(8);
		System.out.println("Print Singly Linked List :");
		ll.printList();
		//ll.deleteFromBegin();
		//System.out.println();
		//ll.printList();
		//ll.deleteFromEnd();
		//System.out.println();
		//ll.printList();
		ll.deleteFromMiddle(7);
		System.out.println();
		ll.printList();

	}

}
