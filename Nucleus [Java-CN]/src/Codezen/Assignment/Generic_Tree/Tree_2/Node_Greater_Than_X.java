package Codezen.Assignment.Generic_Tree.Tree_2;

import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Practice_Quests.Generic_Tree.Number_of_Nodes;

import java.util.Scanner;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;
import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;

public class Node_Greater_Than_X {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root= Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println("\nNO>OF NODES GREATER THAN X: "+number_of_node_greater_than_x(root,scan.nextInt()));
    }

    public static int number_of_node_greater_than_x(Generic_Tree_Node<Integer> root,int x)
    {
        int count=0;
        if(root.data>x)
        {
            count++;
        }
        int i=0,ans;
        while (i<root.children.size())
        {
            ans=number_of_node_greater_than_x(root.children.get(i),x);
            count=count+ans;
            i++;
        }
        return count;
    }
}
