package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Is_Balanced {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(is_balanced(root));
    }

    public static boolean is_balanced(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return true;
        }
        int left_height=height(root.left);
        int right_height=height(root.right);
        if(Math.abs(left_height-right_height)>1)
        {
            return false;
        }
        return is_balanced(root.left) && is_balanced(root.right);
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
