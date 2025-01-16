package day6.ads.binaryTree;

public class BTNode {
	
	int data;
	BTNode leftChild;
	BTNode rightChild;
	
	/*
	In the "BinaryTree" class implemented today in class, add following methods to print tree contents using preorder and postorder traversal.*/

	// void printUsingPreorder();
	private void preOrder(BTNode root) {
		
		if(root == null) return;
		
		System.out.print(root.data+" ");
		
		if(root.leftChild != null) {
			preOrder(root.leftChild);
		}
		if(root.rightChild != null) {
			preOrder(root.rightChild);
		}
	}
	// void printUsingPostorder();
	private void postOrder(BTNode root) {
		
		if(root == null) return;
		
		if(root.leftChild != null) {
			postOrder(root.leftChild);
		}
		if(root.rightChild != null) {
			preOrder(root.rightChild);
		}
		
		System.out.print(root.data+" ");
	}

	// void printUsingInOrder();
	private void inOrder(BTNode root) {
		
		if(root == null) return;
		
		if(root.leftChild != null) {
			inOrder(root.leftChild);
		}
		
		System.out.print(root.data+" ");
		
		if(root.rightChild != null) {
			inOrder(root.rightChild);
		}
	}
	
	/*
	 5. Implement the following function to return number of nodes in a binary tree.
		int CountNodes(); */
	private int countNodes(BTNode root) {
		
		if(root == null) return 0;
		int nodes = 1 + countNodes(root.leftChild) + countNodes(root.rightChild);
		
		return nodes;
	}
	
	/*
	  6. Implement the following function to return number of nodes in a binary tree.
		int CountleafNodes();*/
	
	int countLeaf = 0;
	private void CountLeafNodes(BTNode root){
		
		if(root == null) return;
		if(root.leftChild == null && root.rightChild == null)
		{
			countLeaf++;		
		}else {
			CountLeafNodes(root.leftChild);
			CountLeafNodes(root.rightChild);
		}
	}
	
	
	/*
 7. Implement the following function to return number of nodes in a binary tree, with specific value in it.
		int CountNodesWithValue(int value);*/
	
		int count = 0;
		private int CountNodesWithValue(BTNode root,int value) {
		
		if(root.data == value) count++;

			if(root.leftChild != null )
			{
				CountNodesWithValue(root.leftChild,value);	
			}
			if(root.rightChild != null) {
				CountNodesWithValue(root.rightChild,value);
			}
		return count;
	}
	
	//Wrapper Function
	public void placeHolder() {
		
		BTNode n1 = new BTNode();
		BTNode n2 = new BTNode();
		BTNode n3 = new BTNode();
		BTNode n4 = new BTNode();
		
		n1.data = 10;
		n1.leftChild = n2;
		n1.rightChild = n3;
		n2.data = 10;
		n2.leftChild = n4;
		n2.rightChild = null;
		n3.data = 10;
		n3.leftChild = null;
		n3.rightChild = null;
		n4.data = 10;
		n4.leftChild = null;
		n4.rightChild = null;
		
//		BTNode n1 = new BTNode();
//		BTNode n2 = new BTNode();
//		BTNode n3 = new BTNode();
//		BTNode n4 = new BTNode();
//		BTNode n5 = new BTNode();
//		BTNode n6 = new BTNode();
//		BTNode n7 = new BTNode();
//		
//		n1.data = 10;
//		n1.leftChild = n2;
//		n1.rightChild = n3;
//		n2.data = 40;
//		n2.leftChild = n4;
//		n2.rightChild = n5;
//		n3.data = 20;
//		n3.leftChild = n6;
//		n3.rightChild = n7;
//		n4.data = 70;
//		n4.leftChild = null;
//		n4.rightChild = null;
//		n5.data = 22;
//		n5.leftChild = null;
//		n5.rightChild = null;
//		n6.data = 30;
//		n6.leftChild = null;
//		n6.rightChild = null;
//		n7.data = 50;
//		n7.leftChild = null;
//		n7.rightChild = null;
		
		System.out.print("PreOrder: ");
		preOrder(n1);
		
		System.out.println();
		System.out.print("PostOrder: ");
		postOrder(n1);
		
		System.out.println();
		System.out.print("InOrder: ");
		inOrder(n1);

		System.out.println();
		System.out.print("Number of nodes: ");
		System.out.println(countNodes(n1));

		System.out.println();
		System.out.print("Number of Leafnodes: ");
		CountLeafNodes(n1);
		System.out.println(countLeaf);
		
		System.out.println();
		System.out.print("Number of CountNodesWithValue: ");
		int t = CountNodesWithValue(n1,10);
		System.out.println(t);
	}
}
