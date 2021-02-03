package binaryTree;

import genericTree.BinaryTreeNode;

import java.util.Scanner;

import topic_12binarytree.BSTCheck;

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

		int currentDiameter = Math.max(
				Math.max(leftDiameter.diameter, rightDiameter.diameter), x);
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

	
	
	boolean isBST (BinaryTreeNode<Integer> root, int minValue, int maxValue){
		if(root.data.intValue()<minValue || root.data.intValue()>maxValue){
			return false;
		}
		return isBST(root.left,minValue,root.data)&&isBST(root.right,root.data,maxValue);
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

		int leftMax = getLeftMaxinBT(root);//binary tree
		if (leftMax > root.data.intValue()) {
			return false;
		}
		int rightMin = getRightMininBT(root); //binary tree
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

		int leftMax = getLeftMaxinBST(root);
		if (leftMax > root.data.intValue()) {
			return false;
		}
		int rightMin = getRightMininBST(root);
		if (rightMin < root.data.intValue()) {
			return false;
		}
		return true;
	}

//	isBSTObject isBSTBottomUpBetter(BinaryTreeNode<Integer> root) {
//		if (root == null) {
//			return new isBSTObject();
//		}
//
//		isBSTObject ans = new isBSTObject();
//		isBSTObject leftAns = isBSTBottomUpBetter(root.left);
//		if (!leftAns.isBST) {
//			ans.isBST = false;
//			return ans;
//		}
//		isBSTObject rightAns = isBSTBottomUpBetter(root.right);
//
//		if (!rightAns.isBST) {
//			ans.isBST = false;
//			return ans;
//		}
//
//		if (!(root.data > leftAns.max) || !(root.data < rightAns.min)) {
//			ans.isBST = false;
//			return ans;
//		}
//		ans.isBST = true;
//		ans.min = leftAns.min;
//		ans.max = rightAns.max;
//		return ans;
//
//	}
	public static isBSTObject checkBSTBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			isBSTObject result = new isBSTObject();
			result.isBST = true;
			result.max = Integer.MIN_VALUE;
			result.min = Integer.MAX_VALUE;
			return result;
		}
		isBSTObject ansLeft = checkBSTBetter(root.left);
		isBSTObject ansRight = checkBSTBetter(root.right);
		isBSTObject result = new isBSTObject();
		if (ansLeft.isBST == true && ansRight.isBST == true &&
				root.data > ansLeft.max && root.data < ansRight.min) {
			result.isBST = true;
			result.max = Math.max(root.data, ansRight.max);
			result.min = Math.min(root.data, ansLeft.min);
		} else {
			result.isBST = false;
					}
		return result;
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
