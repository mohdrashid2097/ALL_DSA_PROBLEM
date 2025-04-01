package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

class Node implements Comparable<Node> {
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
	@Override
	public int compareTo(Node o) {
		if(this.data < o.data) {
			return -1;
		}
		else if(this.data > o.data) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
class MyNodeComparator implements Comparator<Node>{
	
	public int compare(Node n1, Node n2) {
		if(n1.data < n2.data) {
			return -1;
		}
		else if(n1.data > n2.data) {
			return 1;
		}
		else {
			return 0;
		}
	}
}

public class MergeKList {
	
	public static void mergeKSortedLikedList(Node[] arr,int k) {
		PriorityQueue<Node> pq = new PriorityQueue<>();
		Node head = new Node(0);
		Node temp = head;
		for(int i=0;i<k;i++) {
		   if(arr[i] != null) {
			   pq.add(arr[i]);
		   }
		}
		
		while(!pq.isEmpty()) {
			Node curr = pq.poll();
			temp.next = curr;
			temp = temp.next;
			if(curr.next != null) {
				pq.add(curr.next);
			}
		}
		
		Node res = head.next;
		
		while(res != null) {
			System.out.print(res.data+" ");
			res = res.next;
		}
	}

	public static void main(String[] args) {
		int n=3;
		// creating array of node which store head of linkedList
		Node[] a = new Node[n];
		// 1st linkedList
		Node head1 = new Node(1);
		a[0] = head1;
		head1.next = new Node(3);
		head1.next.next =new Node(5);
		head1.next.next.next = new Node(7);
		
		//2nd linked List
		Node head2 = new Node(2);
		a[1] = head2;
		head2.next = new Node(4);
		head2.next.next = new Node(6);
		head2.next.next.next = new Node(8);
		
		//3rd LinkedList
		Node head3 = new Node(0);
		a[2] = head3;
		head3.next = new Node(9);
		head3.next.next = new Node(10);
		head3.next.next.next = new Node(11);
		
		mergeKSortedLikedList(a,n);
		
		

	}

}
