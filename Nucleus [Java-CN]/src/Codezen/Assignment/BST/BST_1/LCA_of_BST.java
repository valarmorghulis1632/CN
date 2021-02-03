package Codezen.Assignment.BST.BST_1;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class LCA_of_BST {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Binary_Tree_Node<Integer> root= Creation_of_Binary_Tree.create_binary_tree();
        System.out.println(lca_in_BST(root,scan.nextInt(),scan.nextInt()));
    }

    public static int lca_in_BST(Binary_Tree_Node<Integer> root, int a, int b)
    {
        boolean ans_1=search(root,a);
        boolean ans_2=search(root,b);
        if(ans_1 && !(ans_2))
        {
            return a;
        }
        else if(!(ans_1) && ans_2)
        {
            return b;
        }
        else if(!(ans_1) || !(ans_2))
        {
            return -1;
        }
        else
        {
            return find_lca(root,a,b);
        }
    }

    public static int find_lca(Binary_Tree_Node<Integer> root,int a,int b)
    {
        if(root.data==a)
        {
            return a;
        }
        if(root.data==b)
        {
            return b;
        }
        if(root.data<Math.max(a,b) && root.data>Math.min(a,b))
        {
            return root.data;
        }
        if(root.data>Math.max(a,b))
        {
            return find_lca(root.left,a,b);
        }
        if(root.data<Math.min(a,b))
        {
            return find_lca(root.right,a,b);
        }
        return -1;
    }

    public static boolean search(Binary_Tree_Node<Integer> root,int data)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==data)
        {
            return true;
        }
        else if(root.data>data)
        {
            return search(root.left,data);
        }
        else
        {
            return search(root.right,data);
        }
    }
}
