package Binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBTFromArray {
	
	
	public Node constructBT(int[] nums) {
		
		if(nums.length == 0 || nums == null) {
			return null;
		}
		
		Node root = new Node(nums[0]); 
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		int i = 1;
		
		while(i < nums.length) {
			
			Node curr = q.remove();
			if(i < nums.length) {
				curr.left = new Node(nums[i++]);
				q.add(curr.left);
			}
			if(i < nums.length) {
				curr.right = new Node(nums[i++]);
				q.add(curr.right);
			}
			
			
		}
		
		return root;
		
	}
	
	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
		
	}
	
	public static void levelOrderTraversal(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node curr = q.poll();
			System.out.print(curr.data +" ");
			
			if(curr.left != null) {
				q.add(curr.left);
			}
			if(curr.right != null) {
				q.add(curr.right);
			}
			
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		
		ConstructBTFromArray ll = new ConstructBTFromArray();
		Node root = ll.constructBT(nums);
		levelOrderTraversal(root);
		System.out.println();
		//preOrder(root);
			

	}

}
