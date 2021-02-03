package Lectures.Lecture_15_Generic_Tree_Contd;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;

public class Sum_of_All_Nodes {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Tree_Using_Queue.create_generic_tree_using_queue();
        System.out.println(sum_of_all_nodes(root));
    }

    public static int sum_of_all_nodes(Generic_Tree_Node<Integer> root)
    {
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        int count=0;
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            count=count+current_node.data;
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return count;
    }
}
