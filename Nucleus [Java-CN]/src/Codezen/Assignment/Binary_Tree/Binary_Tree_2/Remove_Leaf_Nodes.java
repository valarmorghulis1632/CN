package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Remove_Leaf_Nodes {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        Creation_of_Binary_Tree.print_tree(remove_leaf_nodes(root));
    }

    public static Binary_Tree_Node<Integer> remove_leaf_nodes(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return null;
        }
        if(root.left==null && root.right==null)
        {
            return null;
        }
        root.left=remove_leaf_nodes(root.left);
        root.right=remove_leaf_nodes(root.right);
        return root;
    }

}
