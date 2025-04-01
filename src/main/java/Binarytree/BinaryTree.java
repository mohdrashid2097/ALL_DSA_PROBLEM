package Binarytree;
class Node{
	Node left, right;
	int data;
	Node(int key){
		data = key;
		left=right=null;
	}
}
public class BinaryTree {
	Node root;
	BinaryTree(){
		root = null;
	}
	
	public void preOrder(Node root) {
		
		if( root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public void postOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public void inOrder(Node root) {
		if(root ==  null) {
			return;
		}
		
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree bt = new BinaryTree();
		
		//create node
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.right.left = new Node(6);
		bt.root.right.right = new Node(7);
		System.out.println("Pre Order Traversal : ");
		bt.preOrder(bt.root);
		System.out.println();
		System.out.println("Post Order Traversal : ");
		bt.postOrder(bt.root);
		System.out.println();
		System.out.println("In Order Traversal : ");
		bt.inOrder(bt.root);

	}

}
