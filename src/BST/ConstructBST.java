package BST;

class Node{
	Node left;
	Node right;
	int data;
	Node(int item){
		data = item;
		left = null;
		right = null;
	}
}
public class ConstructBST {
	
	public static Node insert(Node root, int key) {
		if(root == null) {
			root = newNode(key);
			return root;
		}
		
		if(key < root.data) {
			root.left = insert(root.left, key);
		}
		
		if(key > root.data) {
			root.right = insert(root.right, key);
		}
		
		return root;
	}
	

	private static Node newNode(int key) {
		Node new_Node = new Node(key);
		return new_Node;
	}
	
	public static void inOrder(Node root) {
		
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public static Node searchInBST(Node root, int val) {
		
		while( root != null && root.data != val) {
			root = val<root.data?root.left:root.right;
		}
		
		return root;
	}


	public static void main(String[] args) {
		Node root = null;
		root = insert(root,50);
		insert(root,30);
        insert(root,20);
        insert(root,40);
        insert(root,70);
        insert(root,60);
        insert(root,80);
        
        //inOrder(root);
        
        //search in BST tree
        Node temp = searchInBST(root,70);
        System.out.println();
        System.out.println("Searched Node in the BST Tree : "+temp.data);

	}

}
