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
	
	public static void mergeKSortedLikedListNew(Node[] arr,int k) {
		if( arr == null || arr.length == 0) return;//return null;
		
		//creating mini priority queue
		PriorityQueue<Node> minpq = new PriorityQueue<Node>(Comparator.comparingInt(node->node.data));
		for(Node head:arr) {
			if(head != null) {
				minpq.add(head);
			}
		}
		
		Node dummyNode = new Node(0);
		Node curr = dummyNode;
		while(!minpq.isEmpty()) {
			Node smallestNode = minpq.poll();
			curr.next = smallestNode;
			curr = curr.next;
			if(smallestNode.next != null) {
				minpq.add(smallestNode.next);
			}
		}
		
		System.out.println("Merged LinkedList: "+dummyNode.next);
		Node res = dummyNode.next;
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
		
		mergeKSortedLikedListNew(a,n);
		
		

	}

}
