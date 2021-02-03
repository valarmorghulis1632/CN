package Codezen.Assignment.Binary_Tree.Binary_Tree_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

public class Maximum_Node_in_BT {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        Binary_Tree_Node<Integer> ans=max_in_BT(root);
        if(ans!=null)
        {
            System.out.println(ans.data);
        }
        else
        {
            System.out.println(null+"");
        }
    }

    public static Binary_Tree_Node<Integer> max_in_BT(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return null;
        }

        Binary_Tree_Node<Integer> left_ans=max_in_BT(root.left);
        if(left_ans==null)
        {
            left_ans=new Binary_Tree_Node<>(Integer.MIN_VALUE);
        }
        Binary_Tree_Node<Integer> right_ans=max_in_BT(root.right);
        if(right_ans==null)
        {
            right_ans=new Binary_Tree_Node<>(Integer.MIN_VALUE);
        }
        return new Binary_Tree_Node<>(Math.max(Math.max(left_ans.data,right_ans.data),root.data));
    }
}
