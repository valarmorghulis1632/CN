package Lectures.Lecture_15_Generic_Tree_Contd;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;

public class Height_of_Tree {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Tree_Using_Queue.create_generic_tree_using_queue();
        System.out.println(height_of_tree(root));
    }

    public static <T> int height_of_tree(Generic_Tree_Node<T> root)
    {
        int height=0;
        Queue<Generic_Tree_Node<T>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<T> current_node=queue.remove();
            if(current_node==null && !(queue.isEmpty()))
            {
                height++;
                queue.add(null);
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return height+1;
            }
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return height;
    }
}
