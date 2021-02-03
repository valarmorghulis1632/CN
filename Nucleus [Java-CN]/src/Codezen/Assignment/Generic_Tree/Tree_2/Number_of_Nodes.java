package Codezen.Assignment.Generic_Tree.Tree_2;


import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

public class Number_of_Nodes {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root= Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println(no_of_nodes(root));
    }
    public static int no_of_nodes(Generic_Tree_Node<Integer> root)
    {
        int count=1;
        int i=0;
        while (i<root.children.size())
        {
            count=count+no_of_nodes(root.children.get(i));
            i++;
        }
        return count;
    }
}
