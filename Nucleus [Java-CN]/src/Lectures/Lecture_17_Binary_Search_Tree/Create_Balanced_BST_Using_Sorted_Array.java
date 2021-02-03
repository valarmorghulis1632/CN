package Lectures.Lecture_17_Binary_Search_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class Create_Balanced_BST_Using_Sorted_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] array=new int[elements];
        fillarray(array);
        Binary_Tree_Node<Integer> root=create_BST_using_array(array,0,array.length-1);
        Creation_of_Binary_Tree.print_tree(root);
    }

    public static void fillarray(int[] input)
    {
        Scanner scan=new Scanner(System.in);
        int i=0;
        while (i<input.length)
        {
            System.out.print(" ");
            input[i]=scan.nextInt();
            i++;
        }
    }

    public static Binary_Tree_Node<Integer> create_BST_using_array(int[] input,int beg,int end)
    {
        if(beg>end)
        {
            return null;
        }
        int mid=(beg+end)/2;
        Binary_Tree_Node<Integer> root=new Binary_Tree_Node<>(input[mid]);
        root.left=create_BST_using_array(input,beg,mid-1);
        root.right=create_BST_using_array(input,mid+1,end);
        return root;
    }
}
