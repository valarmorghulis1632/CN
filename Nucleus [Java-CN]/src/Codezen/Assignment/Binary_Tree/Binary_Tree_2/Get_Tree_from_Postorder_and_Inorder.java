package Codezen.Assignment.Binary_Tree.Binary_Tree_2;

import Lectures.Lecture_16_Binary_Tree.Binary_Tree_Node;
import Lectures.Lecture_16_Binary_Tree.Creation_of_Binary_Tree;

import java.util.Scanner;

public class Get_Tree_from_Postorder_and_Inorder {
    static int postorder_index=0;
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] post=new int[elements];
        fill_array(post);
        System.out.println("");
        int[] in=new int[elements];
        fill_array(in);
        postorder_index=post.length-1;
        Binary_Tree_Node<Integer> root=create_tree_using_postorder_and_inorder(post,in,0,in.length-1);
        Creation_of_Binary_Tree.print_tree(root);
    }

    public static void fill_array(int[] array)
    {
        Scanner scan=new Scanner(System.in);
        int i=0;
        while (i<array.length)
        {
            System.out.print(" ");
            array[i]=scan.nextInt();
            i++;
        }
    }

    public static Binary_Tree_Node<Integer> create_tree_using_postorder_and_inorder(int[] postorder, int[] inorder, int start_index, int end_index)
    {
        if(start_index>end_index)
        {
            return null;
        }
        int data=postorder[postorder_index--];
        Binary_Tree_Node<Integer> root=new Binary_Tree_Node<>(data);
        int index=search(data,inorder);
        root.right=create_tree_using_postorder_and_inorder(postorder,inorder,index+1,end_index);
        root.left=create_tree_using_postorder_and_inorder(postorder,inorder,start_index,index-1);
        return root;
    }

    public static int search(int data,int[] inorder)
    {
        int i=0;
        while (i<inorder.length)
        {
            if(inorder[i]==data)
            {
                return i;
            }
            i++;
        }
        return -1;
    }
}
