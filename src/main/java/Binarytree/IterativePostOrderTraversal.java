package Binarytree;

import java.util.Stack;

public class IterativePostOrderTraversal {
	
	Node root;
	
	public void iterativePostOrder(Node root) {
		Stack<Node> st1 = new Stack<Node>();
		Stack<Node> st2 = new Stack<Node>();
		st1.push(root);
		
		while(!st1.isEmpty()) {
			Node temp = st1.pop();
			 st2.add(temp);
			if(temp.left != null) {
				st1.add(temp.left);
			}
			if(temp.right != null) {
				st1.push(temp.right);
			}
			
		}
		while(!st2.isEmpty()) {
			Node temp = st2.pop();
			System.out.print(temp.data+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IterativePostOrderTraversal ll = new IterativePostOrderTraversal();
		
		ll.root = new Node(1);
		ll.root.left = new Node(2);
		ll.root.right = new Node(3);
		ll.root.left.left = new Node(4);
		ll.root.left.right = new Node(5);
		ll.root.right.left = new Node(6);
		ll.root.right.right = new Node(7);
		ll.iterativePostOrder(ll.root);

	}

}
