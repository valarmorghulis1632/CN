package Lectures.Lecture_16_Binary_Tree;

import java.util.Scanner;

public class Creation_of_Binary_Tree {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Binary_Tree_Node<Integer> root=create_binary_tree();
        print_tree(root);
    }

    public static Binary_Tree_Node<Integer> create_binary_tree()
    {
        int data=scan.nextInt();
        if(data==-1)
        {
            return null;
        }
        Binary_Tree_Node<Integer> root=new Binary_Tree_Node<>(data);
        root.left=create_binary_tree();
        root.right=create_binary_tree();
        return root;
    }

    public static <T> void print_tree(Binary_Tree_Node<T> root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        print_tree(root.left);
        print_tree(root.right);
    }
}
