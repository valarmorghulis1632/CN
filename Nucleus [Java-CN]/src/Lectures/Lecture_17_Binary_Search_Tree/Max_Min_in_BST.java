package Lectures.Lecture_17_Binary_Search_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Max_Min_in_BST {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(max_value(root));
        System.out.println(min_value(root));
    }

    public static int max_value(Binary_Tree_Node<Integer> root)
    {
        if(root.right==null)
        {
            return root.data;
        }
        return max_value(root.right);
    }

    public static int min_value(Binary_Tree_Node<Integer> root)
    {
        if(root.left==null)
        {
            return root.data;
        }
        return min_value(root.left);
    }
}
