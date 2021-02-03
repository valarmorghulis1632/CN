package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Create_and_Insert_Duplicates {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        create_and_insert_duplicates(root);
        Creation_of_Binary_Tree.print_tree(root);
    }

    public static void create_and_insert_duplicates(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        create_and_insert_duplicates(root.left);
        Binary_Tree_Node<Integer> temp=new Binary_Tree_Node<>(root.data);
        temp.left=root.left;
        root.left=temp;
        create_and_insert_duplicates(root.right);
    }
}
