package Practice_Quests.BST;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class Insertion_in_BST {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        int data=scan.nextInt();
        Creation_of_Binary_Tree.print_tree(insert_in_BST(root,data));
    }

    public static Binary_Tree_Node<Integer> insert_in_BST(Binary_Tree_Node<Integer> root,int data)
    {
        if(root==null)
        {
            return new Binary_Tree_Node<>(data);
        }
        if(root.data>data)
        {
            root.left=insert_in_BST(root.left,data);
        }
        else if(root.data<data)
        {
            root.right=insert_in_BST(root.right,data);
        }
        return root;
    }
}
