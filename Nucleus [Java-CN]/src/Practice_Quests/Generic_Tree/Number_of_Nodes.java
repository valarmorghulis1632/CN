package Practice_Quests.Generic_Tree;

import java.util.ArrayList;
import java.util.Scanner;

class Generic_Tree_Node <T>
{
    T data;
    ArrayList<Generic_Tree_Node<T>> children;

    public Generic_Tree_Node(T data)
    {
        this.data=data;
        children=new ArrayList<>();
    }
}
public class Number_of_Nodes {
    static Scanner scan=new Scanner(System.in);
    public static Generic_Tree_Node<Integer> create_generic_tree()
    {
        System.out.print("ENTER DATA: ");
        int data=scan.nextInt();
        Generic_Tree_Node<Integer> root=new Generic_Tree_Node<>(data);
        System.out.print("ENTER NO. OF CHILDREN: ");
        int no_of_children=scan.nextInt();
        int i=0;
        while (i<no_of_children)
        {
            root.children.add(create_generic_tree());
            i++;
        }
        return root;
    }

    public static void print_generic_tree(Generic_Tree_Node<Integer> root)
    {
        System.out.println(root.data);
        int i=0;
        while(i<root.children.size())
        {
            print_generic_tree(root.children.get(i));
            i++;
        }
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

    public static void main(String[] args) {
        Generic_Tree_Node<Integer> root=create_generic_tree();
        System.out.println("\nCOUNT IS: "+no_of_nodes(root));
    }
}
