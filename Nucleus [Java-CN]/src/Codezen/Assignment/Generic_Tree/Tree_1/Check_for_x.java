package Codezen.Assignment.Generic_Tree.Tree_1;

import Lectures.Lecture_14_Generic_Tree.Creation_Display_of_Generic_Tree;
import Lectures.Lecture_14_Generic_Tree.Generic_Tree_Node;

import java.util.Scanner;

public class Check_for_x {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Generic_Tree_Node<Integer> root=Creation_Display_of_Generic_Tree.create_generic_tree();
        System.out.println(check_for_x(root,scan.nextInt()));
    }

    public static boolean check_for_x(Generic_Tree_Node<Integer> root,int x)
    {
        if(root.data==x)
        {
            return true;
        }
        int i=0;
        while (i<root.children.size())
        {
            boolean ans=check_for_x(root.children.get(i),x);
            if(ans==true)
            {
                return true;
            }
            i++;
        }
        return false;
    }
}
