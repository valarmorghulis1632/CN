package Lectures.Lecture_17_Binary_Search_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

class Answer_Object
{
    boolean ans_back;
    int max_of_subtree;
    int min_of_subtree;

    Answer_Object()
    {
        ans_back=true;
        max_of_subtree=Integer.MIN_VALUE;
        min_of_subtree=Integer.MAX_VALUE;
    }
}
public class Is_Binary_Tree_a_BST {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
//        Answer_Object ans=is_BT_a_BST(root);
        System.out.println(is_BT_a_BST_1(root,Integer.MIN_VALUE,Integer.MAX_VALUE));
//        System.out.println(ans.ans_back);
    }

    public static Answer_Object is_BT_a_BST(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return new Answer_Object();
        }

        Answer_Object ans=new Answer_Object();

        Answer_Object left_ans=is_BT_a_BST(root.left);
        if(left_ans.ans_back==false)
        {
            ans.ans_back=false;
            return ans;
        }

        Answer_Object right_ans=is_BT_a_BST(root.right);
        if(right_ans.ans_back==false)
        {
            ans.ans_back=false;
            return ans;
        }

        if(root.data.intValue()<left_ans.max_of_subtree || root.data.intValue()>right_ans.min_of_subtree)
        {
            ans.ans_back=false;
            return ans;
        }

        if(left_ans.max_of_subtree==Integer.MIN_VALUE || right_ans.min_of_subtree==Integer.MAX_VALUE)
        {
            ans.ans_back=true;
            ans.min_of_subtree=root.data;
            ans.max_of_subtree=root.data;
            return ans;
        }
        else
        {
            ans.ans_back=true;
            ans.min_of_subtree=left_ans.min_of_subtree;
            ans.max_of_subtree=right_ans.max_of_subtree;
            return ans;
        }
    }

    public static boolean is_BT_a_BST_1(Binary_Tree_Node<Integer> root,int min,int max)
    {
        if(root==null)
        {
            return true;
        }
        if(root.data>min && root.data<max)
        {
            boolean left_ans=is_BT_a_BST_1(root.left,min,root.data);
            if(left_ans==false)
            {
                return left_ans;
            }
            boolean right_ans=is_BT_a_BST_1(root.right,root.data,max);
            if(right_ans==false)
            {
                return right_ans;
            }
            return true;
        }
        return false;
    }
}
