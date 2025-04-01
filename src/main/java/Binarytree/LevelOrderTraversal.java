package Binarytree;

import java.util.LinkedList;
import java.util.Queue;

/*class Node {
	Node left, right;
	int data;
	Node(int item){
		data = item;
		left = right = null;
	}
}*/
public class LevelOrderTraversal {
	Node root;
	
	public void levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			
			Node temp = q.poll();
			System.out.print(temp.data+" ");
			
			if(temp.left != null) {
				q.add(temp.left);
			}
			if(temp.right != null) {
				q.add(temp.right);
			}
		}
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LevelOrderTraversal ll = new LevelOrderTraversal();
		
		ll.root = new Node(1);
		ll.root.left = new Node(2);
		ll.root.right = new Node(3);
		ll.root.left.left = new Node(4);
		ll.root.left.right = new Node(5);
		ll.root.right.left = new Node(6);
		ll.root.right.right = new Node(7);
		ll.levelOrderTraversal(ll.root);

	}

}
