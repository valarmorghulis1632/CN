package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/07/2017.
 */
public class Find_a_Node_in_LL {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        System.out.println("INDEX IS: "+find_node_in_LL(head,scan.nextInt()));
    }

    public static int find_node_in_LL(Node<Integer> head,int num)
    {
        int index=0;
        try
        {
            while((head.data.compareTo(num))!=0)
            {
                index++;
                head=head.next;
            }
            return index;
        }
        catch (NullPointerException e)
        {
            return -1;
        }
    }
}
