package Codezen.Assignment.Linked_List.Linked_List_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Insertion_in_LL_Iteratively {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        int x=scan.nextInt();
        int pos=scan.nextInt();
        head=insert_in_LL(head,x,pos);
        Creation_Display_of_LL.recursively_print(head);
    }

    public static Node insert_in_LL(Node head,int data,int pos)
    {
        Node n=new Node(data);
        if(pos==0)
        {
            n.next=head;
            head=n;
            return head;
        }
        else
        {
            Node temp=head;
            try
            {
                while(pos>1)
                {
                    pos--;
                    temp=temp.next;
                }
                n.next=temp.next;
                temp.next=n;
            }
            catch(NullPointerException e)
            {
                System.out.println("POSITION IS OUT OF BOUNDS");
            }
            return head;
        }
    }
}
