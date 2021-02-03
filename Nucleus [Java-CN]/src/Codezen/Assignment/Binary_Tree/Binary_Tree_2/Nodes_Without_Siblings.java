package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Nodes_Without_Siblings {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        nodes_without_siblings(root);
    }

    public static void nodes_without_siblings(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        if(root.left!=null && root.right==null)
        {
            System.out.println(root.left.data);
        }
        if(root.left==null && root.right!=null)
        {
            System.out.println(root.right.data);
        }
        nodes_without_siblings(root.left);
        nodes_without_siblings(root.right);
    }
}
