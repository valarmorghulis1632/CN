package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

class Answer_Object
{
    boolean is_BST;
    int max;
    int min;
    int height;

    Answer_Object()
    {
        is_BST=true;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        height=0;
    }
}
public class Largest_BST {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        Answer_Object ans=largest_BST(root);
        System.out.print(ans.height);
    }

    public static Answer_Object largest_BST(Binary_Tree_Node<Integer> root)
    {
        if(root==null)
        {
            return new Answer_Object();
        }
        Answer_Object ans=new Answer_Object();
        Answer_Object left_ans=largest_BST(root.left);
        Answer_Object right_ans=largest_BST(root.right);
        if (left_ans.is_BST==false && right_ans.is_BST==false)
        {
            ans.is_BST=false;
            return ans;
        }
        if(left_ans.is_BST==false)
        {
            return right_ans;
        }
        if(right_ans.is_BST==false)
        {
            return left_ans;
        }
        if(root.data>left_ans.max && root.data<right_ans.min)
        {
            int height=Math.max(left_ans.height,right_ans.height)+1;
            ans.height=height;
            ans.max=Math.max(root.data,left_ans.max);
            ans.min=Math.min(root.data,right_ans.min);
            return ans;
        }
        if(root.data<left_ans.max || root.data>right_ans.min)
        {
            ans.height=Math.max(left_ans.height,right_ans.height);
            ans.max=Integer.MAX_VALUE;
            ans.min=Integer.MIN_VALUE;
            return ans;
        }
        return ans;
    }
}
