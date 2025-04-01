package LinkedList;

public class ReverseLinkedList {
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
		if(head == null) {
			head = new_node;
			return;
		}
		new_node.next = head;
		head = new_node;
	}
	
	public void reverseList(Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        head = helper(curr,prev,next);
    }
    Node helper(Node curr, Node prev, Node next){
        if(curr == null){
            return prev;
        }
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        
        return helper(curr,prev,next);
    }
	
	public void reverse() {
		Node curr = head;
		Node next = null;
		Node prev = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList rr = new ReverseLinkedList();
		rr.push(5);
		rr.push(4);
		rr.push(3);
		rr.push(2);
		rr.push(1);
		rr.printList();
		rr.reverse();
		System.out.println();
		rr.printList();
		System.out.println();
		rr.reverseList(rr.head);

	}

}
