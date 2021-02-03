package Codezen.Assignment.Linked_List.Linked_List_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Print_ith_Node_Iteratively {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        int i=scan.nextInt();
        element_at_i(head,i);
    }

    public static void element_at_i(Node head,int i)
    {
        try
        {
            while(i!=0)
            {
                head=head.next;
                i--;
            }
            System.out.println(head.data);
        }
        catch(NullPointerException e)
        {
            System.out.println("GIVEN POSITION IS OUT OF BOUNDS");
        }
    }
}
