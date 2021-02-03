package Lectures.Lecture_15_Generic_Tree_Contd;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;

public class Number_of_Nodes {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Tree_Using_Queue.create_generic_tree_using_queue();
        System.out.println(count_nodes(root));
    }

    public static int count_nodes(Generic_Tree_Node<Integer> root)
    {
        int count=0;
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            int i=0;
            count++;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return count;
    }
}
