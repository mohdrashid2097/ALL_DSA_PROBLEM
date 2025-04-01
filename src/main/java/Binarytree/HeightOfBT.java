package Binarytree;

public class HeightOfBT {
	Node root;
	
	public static int maxDepth(Node root) {
		
		if(root == null) {
			return 0;
		}
		
		int lc = maxDepth(root.left);
		int rc = maxDepth(root.right);
		
		return 1 + Math.max(lc, rc);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeightOfBT bt = new HeightOfBT();
		
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.right.left = new Node(4);
		bt.root.right.right = new Node(5);
		bt.root.right.left.left = new Node(6);
		
		int maxdepth = maxDepth(bt.root);
		System.out.println("Max Depth  :::::: "+maxdepth);
		

	}

}
