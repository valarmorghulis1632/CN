package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

public class Count_Leaf_Nodes {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println(count_leaf_nodes(root));
    }

    public static int count_leaf_nodes(Generic_Tree_Node<Integer> root)
    {
        if(root.children.size()==0)
        {
            return 1;
        }
        int i=0,count=0;
        while (i<root.children.size())
        {
            count=count+count_leaf_nodes(root.children.get(i));
            i++;
        }
        return count;
    }
}
