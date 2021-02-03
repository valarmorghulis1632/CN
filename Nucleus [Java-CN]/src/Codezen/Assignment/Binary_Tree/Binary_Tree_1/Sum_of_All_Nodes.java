package Codezen.Assignment.Binary_Tree.Binary_Tree_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Sum_of_All_Nodes {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(sum_of_all_nodes(root));
    }

    public static int sum_of_all_nodes(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        return root.data+sum_of_all_nodes(root.left)+sum_of_all_nodes(root.right);
    }
}
