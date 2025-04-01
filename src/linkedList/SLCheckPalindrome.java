package linkedList;

import java.util.Stack;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
public class SLCheckPalindrome {
	
	public static boolean isPalindrome(Node head) {
		Stack<Integer> ss = new Stack<Integer>();
		Node h = head;
		while(h != null) {
			ss.push(h.data);
			h = h.next;
		}
		boolean isPlin = true;;
		while(head != null) {
			int i = ss.pop();
			if(head.data == i) {
				isPlin = true;
			}
			else {
				isPlin = false;
				break;
			}
			head = head.next;
		}
		
		return isPlin;
	}
	
	public static void main(String[] args) {
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(3);
		Node six = new Node(2);
		Node seven = new Node(1);
		one.next = two;
		two.next = three;
		three.next = fourth;
		fourth.next = fifth;
		fifth.next = six;
		six.next = seven;
		boolean condition = isPalindrome(one);
		System.out.println(condition);
		

	}

}
