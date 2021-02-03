package Lectures.Lecture_15_Generic_Tree_Contd;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree_Using_Queue {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=create_generic_tree_using_queue();
    }

    public static Generic_Tree_Node<Integer> create_generic_tree_using_queue()
    {
        Scanner scan=new Scanner(System.in);
        int root_data=scan.nextInt();
        Generic_Tree_Node<Integer> root=new Generic_Tree_Node<>(root_data);
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            int no_of_children=scan.nextInt();
            int i=0;
            while (i<no_of_children)
            {
                int child_data=scan.nextInt();
                Generic_Tree_Node<Integer> child_node=new Generic_Tree_Node<>(child_data);
                current_node.children.add(child_node);
                queue.add(child_node);
                i++;
            }
        }
        return root;
    }
}
