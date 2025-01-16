package com.binaryTree;

public class BTNode {

	int data;
	BTNode leftChild;
	BTNode rightChild;
	

    // Traversal methods
	private void preOrder(BTNode root) {
		if(root == null) return;
		
		System.out.print(root.data+" ");
		
		if (root.leftChild != null) {
			preOrder(root.leftChild);
		}
		if(root.rightChild != null) {
			preOrder(root.rightChild);
		}
	}
	
	private void postOrder(BTNode root) {
		if(root == null) return;
		
		if(root.leftChild != null) {
			postOrder(root.leftChild);
		}
		if (root.rightChild != null) {
			postOrder(root.rightChild);
		}
		
		System.out.println(root.data+" ");
	}
	
	private void inOrder(BTNode root) {
		if (root == null) return;
	
		if (root.leftChild != null) {
			inOrder(root.leftChild);
		}
		
		System.out.println(root.data+" ");
		
		if (root.rightChild != null) {
			inOrder(root.rightChild);
		}
	}
	
	private int countNodes(BTNode root) {
		
		if (root == null) return 0;
	
		int nodes = 1 + countNodes(root.leftChild) + countNodes(root.rightChild);
		return nodes;
	}
	
	int leafCount = 0;
	private void countLeafNodes(BTNode root) {
		
		if(root == null) return;
		if (root.leftChild == null && root.rightChild == null) {
			leafCount++;
		}else {
			countLeafNodes(root.leftChild);
			countLeafNodes(root.rightChild);
		}
		
	}
	
	
	
	
	
}
