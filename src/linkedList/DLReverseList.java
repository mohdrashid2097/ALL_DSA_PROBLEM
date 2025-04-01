package linkedList;

public class DLReverseList {
	Node head;
	
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
			prev = next = null;
		}
	}
	public void reverse() {
		Node temp = null;
		Node current = head;
		while(current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		//System.out.println(temp.prev.data);
		
		if(temp != null) {
			head = temp.prev;
		}
	}
	
	
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		new_node.prev = null;
		if(head != null) {
			head.prev = new_node;
		}
		head = new_node;
		
	}
	public void printList() {
		Node tNode = head;
		Node last = null;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			last = tNode;
			tNode = tNode.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		DLReverseList dl = new DLReverseList();
		dl.push(5);
		dl.push(4);
		dl.push(3);
		dl.push(2);
		dl.push(1);
		System.out.println("Print Doubly Linked List :");
		dl.printList();
		dl.reverse();
		System.out.println("Reverse Doubly Linked List :");
		dl.printList();
		//System.out.println("This is for 2nd way:");
		//dl.reverseSec();
		//dl.printList();

	}

}
