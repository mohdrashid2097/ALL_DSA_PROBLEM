package binarytree;

import java.util.Stack;

public class IterativePreOrderTraversal {
	Node root;
	
	public void iterativePreOrder(Node root) {
		Stack<Node> st = new Stack<Node>();
		st.add(root);
		while(!st.isEmpty()) {
			
			Node temp = st.pop();
			System.out.print(temp.data+" ");
			
			if(temp.right != null) {
				st.add(temp.right);
			}
			if(temp.left != null) {
				st.add(temp.left);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IterativePreOrderTraversal ll = new IterativePreOrderTraversal();
		ll.root = new Node(1);
		ll.root.left = new Node(2);
		ll.root.right = new Node(3);
		ll.root.left.left = new Node(4);
		ll.root.left.right = new Node(5);
		ll.root.right.left = new Node(6);
		ll.root.right.right = new Node(7);
		ll.iterativePreOrder(ll.root);

	}

}
