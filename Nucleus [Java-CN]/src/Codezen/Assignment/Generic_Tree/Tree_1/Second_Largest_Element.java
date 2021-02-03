package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Second_Largest_Element {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println((second_largest_element(root)).data);
    }

    public static Generic_Tree_Node<Integer> second_largest_element(Generic_Tree_Node<Integer> root)
    {
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        queue.add(root);
        Generic_Tree_Node<Integer> large=new Generic_Tree_Node<>(root.data);
        Generic_Tree_Node<Integer> second_large=new Generic_Tree_Node<>(Integer.MAX_VALUE);
        while (!queue.isEmpty())
        {
            Generic_Tree_Node<Integer> current_node=queue.remove();
            if(current_node.data>=large.data)
            {
                second_large=large;
                large=current_node;
            }
            else if(current_node.data<=large.data && current_node.data>=second_large.data)
            {
                second_large=current_node;
            }
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return second_large;
    }




//    public static int second_largest_element_1(Generic_Tree_Node<Integer> root)
//    {
//        int large=root.data;
//        int second_large=root.data;
//        int i=0,ans;
//        while (i<root.children.size())
//        {
//            ans=second_largest_element_1(root.children.get(i));
//            if(ans>large)
//            {
//                second_large=large;
//                large=ans;
//            }
//            else if(ans<large && ans>second_large)
//            {
//                second_large=ans;
//            }
//            i++;
//        }
//        return second_large;
//    }
}
