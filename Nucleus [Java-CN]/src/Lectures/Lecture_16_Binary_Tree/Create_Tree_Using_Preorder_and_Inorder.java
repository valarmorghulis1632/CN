package Lectures.Lecture_16_Binary_Tree;

import java.util.Scanner;

public class Create_Tree_Using_Preorder_and_Inorder {
    static int preorder_index=0;

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        int[] pre=new int[elements];
        fill_array(pre);
        System.out.println("");
        int[] in=new int[elements];
        fill_array(in);
        Binary_Tree_Node<Integer> root=create_tree_using_preorder_and_inorder(pre,in,0,in.length-1);
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

    public static Binary_Tree_Node<Integer> create_tree_using_preorder_and_inorder(int[] preorder,int[] inorder,int start_index,int end_index)
    {
        if(start_index>end_index)
        {
            return null;
        }
        int data=preorder[preorder_index++];
        Binary_Tree_Node<Integer> root=new Binary_Tree_Node<>(data);
        int index=search(data,inorder);
        root.left=create_tree_using_preorder_and_inorder(preorder,inorder,start_index,index-1);
        root.right=create_tree_using_preorder_and_inorder(preorder,inorder,index+1,end_index);
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


