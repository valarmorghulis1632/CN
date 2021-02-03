package Lectures.Lecture_14_Generic_Tree;

import java.util.Scanner;

public class Creation_Display_of_Generic_Tree {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=create_generic_tree();
        print_generic_tree(root);
    }
    public static Generic_Tree_Node<Integer> create_generic_tree()
    {
        int data=scan.nextInt();
        Generic_Tree_Node<Integer> root=new Generic_Tree_Node<>(data);
        int no_of_children=scan.nextInt();
        int i=0;
        while (i<no_of_children)
        {
            root.children.add(create_generic_tree());
            i++;
        }
        return root;
    }

    public static void print_generic_tree(Generic_Tree_Node<Integer> root)
    {
        System.out.print(root.data+" ");
        int i=0;
        while(i<root.children.size())
        {
            print_generic_tree(root.children.get(i));
            i++;
        }
    }
}
