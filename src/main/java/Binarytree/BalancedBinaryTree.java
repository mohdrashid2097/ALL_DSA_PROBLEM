package Binarytree;

/*class Node{
	int data;
	Node left;
	Node right;
	Node(int d){
		data = d;
		left = null;
		right = null;
	}
}*/

public class BalancedBinaryTree {
	Node root;
	
	public static class Node{
		int d;
		Node left;
		Node right;
		Node(int data){
			d = data;
			left = null;
			right = null;
		}
	}
	
	public boolean balancedBinaryTree(Node head) {
		
		return dfs(head) != -1;
		
	}
	public int dfs(Node head) {
		if(head == null) return 0;
		
		int lh = dfs(head.left);
		if(lh == -1) return -1;
		
		int rh = dfs(head.right);
		if(rh == -1) return -1;
		
		if(Math.abs(rh-lh) > 1) {
			return -1;
		}
		
		return 1+ Math.max(lh, rh);
	}
	
	public void preOrder(Node head) {
		if(head == null) {
			return;
		}
		System.out.print(head.d+" ");
		preOrder(head.left);
		preOrder(head.right);
	}

	public static void main(String[] args) {
		BalancedBinaryTree bt = new BalancedBinaryTree();
		
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		
		bt.preOrder(bt.root);
		//bt.balancedBinaryTree(bt.root);
		System.out.println();
		System.out.println(bt.balancedBinaryTree(bt.root));
		

	}

}
