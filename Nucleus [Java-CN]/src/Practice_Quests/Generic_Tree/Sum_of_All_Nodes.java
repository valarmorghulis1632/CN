package Practice_Quests.Generic_Tree;

import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

public class Sum_of_All_Nodes {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root= Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println("SUM OF ALL NODES: "+sum_of_all_nodes(root));
    }

    public static int sum_of_all_nodes(Generic_Tree_Node<Integer> root)
    {
        int count=root.data;
        int i=0;
        while (i<root.children.size())
        {
            count=count+sum_of_all_nodes(root.children.get(i));
            i++;
        }
        return count;
    }
}
