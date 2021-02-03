package Codezen.Assignment.Linked_List.Linked_List_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Deletion_in_LL_Iteratively {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        int pos=scan.nextInt();
        Creation_Display_of_LL.recursively_print(deletion_in_LL(head,pos));
    }

    public static Node deletion_in_LL(Node head,int pos)
    {
        if(pos==0)
        {
            return head.next;
        }
        try
        {
            Node temp=head;
            while(pos>1)
            {
                pos--;
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        catch (NullPointerException e)
        {

        }
        return head;
    }
}
