package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

public class Node_Having_Sum_of_Children_Plus_Itself_Max {
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Creation_Display_of_Generic_Tree.create_generic_tree();
        Generic_Tree_Node<Integer> ans=sum_children_itself_max(root);
        System.out.println(ans.data);
    }

    public static Generic_Tree_Node<Integer> sum_children_itself_max(Generic_Tree_Node<Integer> root)
    {
        int i=0;
        int ans_1=root.data,temp;
        while (i<root.children.size())
        {
            ans_1=ans_1+root.children.get(i).data;
            i++;
        }
        i=0;
        Generic_Tree_Node<Integer> ans_2,ans_3=root;
        int k=Integer.MIN_VALUE;
        while (i<root.children.size())
        {
            ans_2=sum_children_itself_max(root.children.get(i));
            temp=ans_2.data;
            int j=0;
            while (j<ans_2.children.size())
            {
                temp=temp+ans_2.children.get(j).data;
                j++;
            }
            if(k<temp)
            {
                k=temp;
                ans_3=ans_2;
            }
            i++;
        }
        if(k<ans_1)
        {
            return root;
        }
        else
        {
            return ans_3;
        }
    }
}
