package Codezen.Assignment.Binary_Tree.Binary_Tree_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class Find_Node {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root=Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(find_node_of_x(root,scan.nextInt()));
    }

    public static boolean find_node_of_x(Binary_Tree_Node<Integer> root,int x)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==x)
        {
            return true;
        }
        return find_node_of_x(root.left,x) || find_node_of_x(root.right,x);
    }
}
