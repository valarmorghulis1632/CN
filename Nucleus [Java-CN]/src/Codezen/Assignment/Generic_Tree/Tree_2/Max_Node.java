package Codezen.Assignment.Generic_Tree.Tree_2;

import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

public class Max_Node {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root= Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println((max_node(root)).data);
    }

    private static Generic_Tree_Node<Integer> max_node(Generic_Tree_Node<Integer> root) {
        if(root==null)
        {
            return null;
        }
        int i=0;
        Generic_Tree_Node<Integer> large=new Generic_Tree_Node<>(root.data);
        Generic_Tree_Node<Integer> ans;
        while (i<root.children.size())
        {
            ans=max_node(root.children.get(i));
            if(ans.data>large.data)
            {
                large=ans;
            }
            i++;
        }
        return large;
    }
}
