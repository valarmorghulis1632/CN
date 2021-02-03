package Codezen.Assignment.Generic_Tree.Tree_2;

import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Nodes_at_Depth_k {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Generic_Tree_Node<Integer> root= Creation_Display_of_Generic_Tree.create_generic_tree();
        nodes_at_depth_k(root,scan.nextInt());
    }

    private static void nodes_at_depth_k(Generic_Tree_Node<Integer> root, int k) {
        if(root==null)
        {
            return;
        }
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        int count=0;
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            if(current_node==null && !(queue.isEmpty()))
            {
                count++;
                queue.add(null);
                continue;
            }
            if(current_node==null && queue.isEmpty())
            {
                return;
            }
            if(count==k)
            {
                System.out.print(current_node.data+" ");
            }
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
    }
}
