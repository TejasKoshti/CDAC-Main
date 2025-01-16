package day6.ads.java;

public class BinaryTree {
	class BTNode {
		int data;
		BTNode leftChild;
		BTNode rightChild;
	}
	
	private BTNode root;
	
	public BinaryTree() {
		root = null;
	}

	public void createTree01() {
		BTNode n1 = new BTNode();
		BTNode n2 = new BTNode();
		BTNode n3 = new BTNode();
		BTNode n4 = new BTNode();
		
		n1.data = 5;
		n1.leftChild = n2;
		n1.rightChild = n3;
		
		n2.data = 10;
		n2.leftChild = n4;
		n2.rightChild = null;
		
		n3.data = 6;
		n3.leftChild = null;
		n3.rightChild = null;
		
		n4.data = 8;
		n4.leftChild = null;
		n4.rightChild = null;
		
		root = n1;
	}

	private void printUsingInorder(BTNode root) {
		if (root == null) {
			return;
		}
		
		if (root.leftChild != null) {
			printUsingInorder(root.leftChild);
		}

		System.out.print(root.data + " ");

		if (root.rightChild != null) {
			printUsingInorder(root.rightChild);
		}
	}
	
	public void printUsingInorder() {
		printUsingInorder(root);
		System.out.println("");
	}
}
