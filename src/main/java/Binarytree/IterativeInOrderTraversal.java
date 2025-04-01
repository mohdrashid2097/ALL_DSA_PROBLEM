package Binarytree;

import java.util.Stack;

public class IterativeInOrderTraversal {
	Node root;
	
	public void iterativeInOrder(Node root) {
		Stack<Node> st = new Stack<Node>();
		Node curr = root;
		
		while(curr != null || st.size() > 0) {
			
			while( curr.left != null) {
				st.push(curr);
				curr = curr.left;
			}
			
			curr = st.pop();
			System.out.print(curr.data +" ");
			curr = curr.right;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IterativeInOrderTraversal ll = new IterativeInOrderTraversal();
		
		ll.root = new Node(1);
		ll.root.left = new Node(2);
		ll.root.right = new Node(3);
		ll.root.left.left = new Node(4);
		ll.root.left.right = new Node(5);
		ll.root.right.left = new Node(6);
		ll.root.right.right = new Node(7);
		ll.iterativeInOrder(ll.root);

	}

}
