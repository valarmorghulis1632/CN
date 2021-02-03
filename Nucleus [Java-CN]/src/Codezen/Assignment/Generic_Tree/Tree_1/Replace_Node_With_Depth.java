package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Replace_Node_With_Depth {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Creation_Display_of_Generic_Tree.create_generic_tree();
        Creation_Display_of_Generic_Tree.print_generic_tree(replace_node_with_depth(root));
    }

    public static Generic_Tree_Node<Integer> replace_node_with_depth(Generic_Tree_Node<Integer> root)
    {
        Queue<Generic_Tree_Node<Integer>> queue=new LinkedList<>();
        int count=0;
        queue.add(root);
        queue.add(null);
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
                return root;
            }
            current_node.data=count;
            int i=0;
            while (i<current_node.children.size())
            {
                queue.add(current_node.children.get(i));
                i++;
            }
        }
        return root;
    }
}
