package LinkedList;

public class SLFindLenght {
	
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
	public void findLength() {
		Node curNode = head;
		int count = 0;
		while(curNode != null) {
			count++;
			curNode = curNode.next;
		}
		System.out.println("Length of Linked List :"+count);
	}
	public int findLengthRec(Node curNode) {
		if(curNode == null) {
			return 0;
		}
		return 1+findLengthRec(curNode.next);
	}
	public int findLengthRecOne(Node curNode, int count) {
		if(curNode == null) {
			return count;
		}
		return findLengthRecOne(curNode.next, count + 1);
	}
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
		
	}

	public static void main(String[] args) {
		SLFindLenght ll = new SLFindLenght();
		ll.push(1);
		ll.push(2);
		ll.push(3);
		ll.push(4);
		ll.push(5);
		ll.printList();
		System.out.println();
		//ll.findLength();
		System.out.println(ll.findLengthRec(ll.head));
		System.out.println(ll.findLengthRecOne(ll.head,0));

	}

}
