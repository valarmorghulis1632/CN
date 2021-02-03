package Codezen.Assignment.Binary_Tree.Binary_Tree_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Diameter_of_BT {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(diameter_of_BT(root));
    }

    public static int diameter_of_BT(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        int left_ans=diameter_of_BT(root.left);
        int right_ans=diameter_of_BT(root.right);
        int path_through_root=height(root.left)+height(root.right)+1;
        return Math.max(Math.max(left_ans,right_ans),path_through_root);
    }

    public static int height(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return 0;
        }
        int left_ans=height(root.left);
        int right_ans=height(root.right);
        return Math.max(left_ans,right_ans)+1;
    }
}
