package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Next_Larger_Element_in_Tree {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Generic_Tree_Node<Integer> root=Creation_Display_of_Generic_Tree.create_generic_tree();
        Generic_Tree_Node<Integer> ans=next_larger_element(root,scan.nextInt());
        System.out.println(ans.data);
    }

    public static Generic_Tree_Node<Integer> next_larger_element(Generic_Tree_Node<Integer> root,int n)
    {
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        Generic_Tree_Node<Integer> node=new Generic_Tree_Node<>(Integer.MAX_VALUE);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            if(current_node.data>n && current_node.data<node.data)
            {
                node=current_node;
            }
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return node;
    }
}
