package Codezen.Practice_Section.Binary_Tree;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.ArrayList;

public class Sum_Tree {
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        ArrayList<Integer> arrayList=sum_tree(root);
        for (int x :arrayList)
        {
            System.out.print(x+" ");
        }
    }

    private static ArrayList<Integer> sum_tree(Binary_Tree_Node<Integer> root) {
        if(root==null)
        {
            return new ArrayList<>();
        }
        int left_data=0,right_data=0;
        if(root.left!=null)
        {
            left_data=root.left.data;
        }
        if(root.right!=null)
        {
            right_data=root.right.data;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        root.data=left_data+right_data;
        ArrayList<Integer> left_ans=sum_tree(root.left);
        ArrayList<Integer> right_ans=sum_tree(root.right);
        ans.add(root.data);
        ans.addAll(left_ans);
        ans.addAll(right_ans);
        return ans;
    }
}
