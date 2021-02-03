package Lectures.Lecture_15_Generic_Tree_Contd;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;

public class Largest_Element_in_Tree {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Tree_Using_Queue.create_generic_tree_using_queue();
        System.out.println(largest_element(root));
    }

    public static int largest_element(Generic_Tree_Node<Integer> root)
    {
        int large=root.data;
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            if(current_node.data>large)
            {
                large=current_node.data;
            }
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return large;
    }
}
