package LinkedList;

public class DLDeletionOperation {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int d){
			data = d;
			next = null;
			prev = null;
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
	public void deleteBeginning() {
		head = head.next;
		head.next.prev = null;
		System.gc();
		
	}
	public void deleteFromEnd(){
		Node last = head;
		Node prev_node = null;
		while(last.next != null) {
			prev_node = last;
			last = last.next;
		}
		prev_node.next = null;
		last.prev = null;
		System.gc();
		
	}
	public void atGivenPosition(int n) {
		int count = 1;
		Node tNode = head;
		if(head == null) {
			return;
		}
		if(n==1) {
			head = head.next;
			head.next.prev = null;
			return;
		}
		Node prev = null;
		while(tNode.next != null && count != n) {
			count++;
			prev = tNode;
			tNode = tNode.next;
		}
		prev.next = tNode.next;
		tNode.next.prev = prev;
		System.gc();
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
		/*
		 * while(last != null) { System.out.print(last.data+" "); last = last.prev; }
		 */
	}

	public static void main(String[] args) {
		DLDeletionOperation dl = new DLDeletionOperation();
		dl.push(5);
		dl.push(4);
		dl.push(3);
		dl.push(2);
		dl.push(1);
		dl.printList();
		System.out.println("Delete from beginning :");
		//dl.deleteBeginning();
		//dl.printList();
		//dl.deleteFromEnd();
		//dl.printList();
		dl.atGivenPosition(2);
		dl.printList();
	}

}
