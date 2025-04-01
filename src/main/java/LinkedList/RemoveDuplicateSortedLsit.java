package LinkedList;


public class RemoveDuplicateSortedLsit {
 Node head;
 class Node {
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
	public void removeDuplicate() {
		Node curr = head;
		while(curr !=null) {
			Node temp = curr;
			while(temp != null && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}
	public void printList() {
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode=tNode.next;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicateSortedLsit llist = new RemoveDuplicateSortedLsit();
        llist.push(20);
        llist.push(13);
        llist.push(13);
        llist.push(11);
        llist.push(11);
        llist.push(11);
        llist.printList();
        System.out.println();
        llist.removeDuplicate();
        System.out.println();
        llist.printList();

	}

}
