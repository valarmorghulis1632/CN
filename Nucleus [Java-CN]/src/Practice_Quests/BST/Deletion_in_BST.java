package Practice_Quests.BST;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class Deletion_in_BST {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        int data=scan.nextInt();
        Creation_of_Binary_Tree.print_tree(delete_in_BST(root,data));
    }

    public static Binary_Tree_Node<Integer> delete_in_BST(Binary_Tree_Node<Integer> root,int data)
    {
        if(root.data<data)
        {
            root.right=delete_in_BST(root.right,data);
        }
        else if(root.data> data)
        {
            root.left=delete_in_BST(root.left,data);
        }
        else
        {
            if(root.right==null && root.left==null)
            {
                return null;
            }
            if(root.left!=null && root.right==null)
            {
                return root.left;
            }
            Binary_Tree_Node<Integer> temp=new Binary_Tree_Node<>(search_leftmost(root.right).data);
            temp.left=root.left;
            temp.right=delete_in_BST(root.right,temp.data);
            root=temp;
        }
        return root;
    }

    public static Binary_Tree_Node<Integer> search_leftmost(Binary_Tree_Node<Integer> root)
    {
        if(root.left==null)
        {
            return root;
        }
        return search_leftmost(root.left);
    }
}
