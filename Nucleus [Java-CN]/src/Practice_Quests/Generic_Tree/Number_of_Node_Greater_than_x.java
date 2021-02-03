package Practice_Quests.Generic_Tree;

import java.util.Scanner;

public class Number_of_Node_Greater_than_x {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=Number_of_Nodes.create_generic_tree();
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
