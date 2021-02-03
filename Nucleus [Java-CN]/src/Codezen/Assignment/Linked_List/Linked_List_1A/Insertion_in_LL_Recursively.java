package Codezen.Assignment.Linked_List.Linked_List_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Insertion_in_LL_Recursively {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        int data=scan.nextInt();
        int pos=scan.nextInt();
        Creation_Display_of_LL.recursively_print(insert_in_LL_recursively(head,data,pos));
    }

    public static Node insert_in_LL_recursively(Node head,int data,int pos)
    {
        try
        {
            if(pos==0)
            {
                Node n=new Node(data);
                n.next=head;
                return n;
            }
            if(pos==1)
            {
                try
                {
                    Node n=new Node(data);
                    n.next=head.next;
                    head.next=n;
                    return head;
                }
                finally {

                }
            }
            Node ans=insert_in_LL_recursively(head.next,data,pos-1);
        }
        catch (NullPointerException e)
        {

        }
        return head;
    }
}
