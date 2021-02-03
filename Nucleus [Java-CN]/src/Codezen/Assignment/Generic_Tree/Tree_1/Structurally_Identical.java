package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

public class Structurally_Identical {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root_1=Creation_Display_of_Generic_Tree.create_generic_tree();
        Generic_Tree_Node<Integer> root_2=Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println(check_structurally_identical(root_1,root_2));
    }

    public static boolean check_structurally_identical(Generic_Tree_Node<Integer> root_1,Generic_Tree_Node<Integer> root_2)
    {
        if(!(root_1.data.equals(root_2.data)) || root_1.children.size()!=root_2.children.size())
        {
            return false;
        }
        int i=0;
        while (i<root_1.children.size())
        {
            boolean ans=check_structurally_identical(root_1.children.get(i),root_2.children.get(i));
            if(ans==false)
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
