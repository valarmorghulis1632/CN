package Codezen.Assignment.Generic_Tree.Tree_2;

import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;

public class Print_Level_Wise {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root= Creation_Display_of_Generic_Tree.create_generic_tree();
        print_level_wise(root);
    }

    private static void print_level_wise(Generic_Tree_Node<Integer> root) {
        if(root==null)
        {
            return;
        }
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null &&!(queue.isEmpty()))
            {
                queue.add(null);
                System.out.println("");
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return;
            }
            System.out.print(current_node.data+" ");
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
    }
}
