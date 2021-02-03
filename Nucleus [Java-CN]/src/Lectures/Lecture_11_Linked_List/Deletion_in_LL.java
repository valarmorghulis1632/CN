package Lectures.Lecture_11_Linked_List;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Deletion_in_LL {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_LL.create_linked_list();
        int item=scan.nextInt();
        Creation_Display_LL.recursive_display(deletion_in_LL(head,item));
    }

    public static Node deletion_in_LL(Node head,int item)
    {
        if(head.data==item)
        {
            head=head.next;
            return head;
        }
        Node temp=head;
        try
        {
            while(temp.next.data!=item)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        catch(NullPointerException e)
        {
            System.out.println("ELEMENT NOT FOUND");
        }
        return head;
    }
}
