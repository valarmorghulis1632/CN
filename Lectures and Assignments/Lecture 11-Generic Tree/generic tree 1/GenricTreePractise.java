package genericTree;

import java.util.Scanner;

public class GenricTreePractise {
	static Scanner s = new Scanner(System.in);

	// 5 3 4 2 3 0 1 0 7 0 6 0
	public static GenericTreeNode<Integer> prepareTree() {

		System.out.println("Enter data");
		int data = s.nextInt();

		GenericTreeNode<Integer> root = new GenericTreeNode<>(data);
		System.out.println("Enter no. of children");
		int noOfChildren = s.nextInt();
		for (int i = 0; i < noOfChildren; i++) {
			root.children.add(prepareTree());
		}
		return root;
	}

	public static <T> void printTree(GenericTreeNode<T> root) {
		System.out.println(root.data);

		for (GenericTreeNode<T> child : root.children) {
			printTree(child);
		}

		// for(int i=0;i<root.children.size();i++){
		// printTree(root.children.get(i));
		// }
	}

	public static <T> int count(GenericTreeNode<T> root) {
		int count = 1;

		for (int i =0;i<root.children.size();i++) {
			count = count + count(root.children.get(i));
		}

		return count;
	}

	public static void main(String[] args) {

		GenericTreeNode<Integer> root = prepareTree();
		printTree(root);

		// GenericTreeNode<Integer> root5 = new GenericTreeNode<Integer>(5);
		// GenericTreeNode<Integer> root4 = new GenericTreeNode<Integer>(4);
		// GenericTreeNode<Integer> root7 = new GenericTreeNode<Integer>(7);
		// GenericTreeNode<Integer> root6 = new GenericTreeNode<Integer>(6);
		// GenericTreeNode<Integer> root3 = new GenericTreeNode<Integer>(3);
		// GenericTreeNode<Integer> root1 = new GenericTreeNode<Integer>(1);
		//
		// root5.children.add(root4);
		// root5.children.add(root7);
		// root5.children.add(root6);
		// root4.children.add(root3);
		// root4.children.add(root1);
	}
}
