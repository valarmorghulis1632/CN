package binaryTree;

import genericTree.BinaryTreeNode;

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

	<T> void printTree(BinaryTreeNode<T> root) {
		if (root == null) {
			return;
		}
		printTree(root.left);
		printTree(root.right);
		System.out.println(root.data);
	}

	<T> DiameterObject diameterBetter(BinaryTreeNode<T> root) {
		if (root == null) {
			return new DiameterObject(0, 0);
		}
		DiameterObject leftDiameter = diameterBetter(root.left);
		DiameterObject rightDiameter = diameterBetter(root.right);
		int x = leftDiameter.height + rightDiameter.height + 1;

		int currentDiameter = Math.max(Math.max(leftDiameter.diameter, rightDiameter.diameter), x);
		int currentHeight = Math.max(leftDiameter.height, rightDiameter.height) + 1;
		DiameterObject ans = new DiameterObject(currentDiameter, currentHeight);
		return ans;
	}

	<T> void mirror(BinaryTreeNode<T> root) {
		BinaryTreeNode<T> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirror(root.left);
		mirror(root.right);
	}

	<T> int diameter(BinaryTreeNode<T> root) {
		if (root == null) {
			return 0;
		}
		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);
		int x = height(root.left) + height(root.right) + 1;

		return Math.max(Math.max(leftDiameter, rightDiameter), x);
	}

	static int preIndex = 0;

	BinaryTreeNode<Integer> constructTreeUsingPreIno(int[] pre, int[] in,
			int startIndex, int endIndex) {
		if (startIndex > endIndex) {
			return null;
		}
		int data = pre[preIndex++];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);

		int index = search(data, in);
		root.left = constructTreeUsingPreIno(pre, in, startIndex, index - 1);
		root.right = constructTreeUsingPreIno(pre, in, index + 1, endIndex);
		return root;
	}

	boolean isBST(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return true;
		}

		int leftMax = getLeftMax(root);
		if (leftMax > root.data.intValue()) {
			return false;
		}
		int rightMin = getRightMin(root);
		if (rightMin < root.data.intValue()) {
			return false;
		}

		return isBST(root.left) && isBST(root.right);

	}

	boolean isBSTBottomUp(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}

		if (!isBSTBottomUp(root.left) || !isBSTBottomUp(root.right)) {
			return false;
		}

		int leftMax = getLeftMax(root);
		if (leftMax > root.data.intValue()) {
			return false;
		}
		int rightMin = getRightMin(root);
		if (rightMin < root.data.intValue()) {
			return false;
		}

	}

	isBSTObject isBSTBottomUpBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new isBSTObject();
		}

		isBSTObject ans = new isBSTObject();
		isBSTObject leftAns = isBSTBottomUpBetter(root.left);
		if (!leftAns.isBST) {
			ans.isBST = false;
			return ans;
		}
		isBSTObject rightAns = isBSTBottomUpBetter(root.right);

		if (!rightAns.isBST) {
			ans.isBST = false;
			return ans;
		}

		if (!(root.data > leftAns.max) || !(root.data < rightAns.min)) {
			ans.isBST = false;
			return ans;
		}
		ans.isBST = true;
		ans.min = leftAns.min;
		ans.max = rightAns.max;
		return ans;

	}

}

class isBSTObject {
	boolean isBST;
	int max;
	int min;

	isBSTObject() {
		this.isBST = true;
		this.min = Integer.MAX_VALUE;
		this.max = Integer.MIN_VALUE;
	}
}







class DiameterObject {
	int diameter;
	int height;

	DiameterObject(int diameter, int height) {
		this.diameter = diameter;
		this.height = height;
	}
}
