package Codezen.Assignment.Binary_Tree.Binary_Tree_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class Node_Data_Greater_Than_X {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(node_greater_than_x(root,scan.nextInt()));
    }

    public static int node_greater_than_x(Binary_Tree_Node<Integer> root,int x)
    {
        if(root==null)
        {
            return 0;
        }
        int count=0;
        if(root.data>x)
        {
            count++;
        }
        return count+node_greater_than_x(root.left,x)+node_greater_than_x(root.right,x);
    }
}
