package Codezen.Assignment.Linked_List.Linked_List_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Deletion_in_LL_Recursively {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        int pos=scan.nextInt();
        Creation_Display_of_LL.recursively_print(delete_in_LL_recursively(head,pos));
    }

    public static Node delete_in_LL_recursively(Node head,int pos)
    {
        try
        {
            if(pos==0)
            {
                return head.next;
            }
            if(pos==1)
            {
                try
                {
                    head.next=head.next.next;
                    return head;
                }
                finally {

                }
            }

            delete_in_LL_recursively(head.next,pos-1);
        }
        catch(NullPointerException e)
        {

        }
        return head;
    }
}
