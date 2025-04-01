package LinkedList;

/*class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}*/

public class InsertNode {

	public void insertNode(int[] arr) {
		Node head = null;
		for(int i=0;i<arr.length;i++) {
		 head = createList(head,arr[i]);
		 System.out.println(arr[i]);
		}
		
		Node tNode = head;
		while(tNode != null) {
			System.out.print(tNode.data+" ");
			tNode = tNode.next;
		}
	}
	public Node createList(Node head,int new_data) {
		
		if(head == null) {
			head = new Node(new_data);
			System.out.println(head.data);
			return head;
		}
		Node new_node = new Node(new_data);
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return head;
	}
	public static void main(String[] args) {
		InsertNode ll = new InsertNode();
		int[] arr = {1,2,3,4,5,6};
		ll.insertNode(arr);

	}

}
