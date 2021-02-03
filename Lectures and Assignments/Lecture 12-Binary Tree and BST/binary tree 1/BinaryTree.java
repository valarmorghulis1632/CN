package binaryTree;

import java.util.Scanner;

public class BinaryTree {
	Scanner s = new Scanner(System.in);

	BinaryTreeNode<Integer> prepareTree() {
		System.out.println("Enter data");
		int data = s.nextInt();
		if (data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
		root.left = prepareTree();
		root.right = prepareTree();
		return root;

	}
	
	<T>void printTree(BinaryTreeNode<T> root){
		if(root==null){
			return;
		}	
		printTree(root.left);
		printTree(root.right);
		System.out.println(root.data);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
