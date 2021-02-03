package Lectures.Lecture_11_Linked_List;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Insert_in_LL {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_LL.create_linked_list();
        int x=scan.nextInt();
        int pos=scan.nextInt();
        head=insert_in_LL(head,x,pos);
        Creation_Display_LL.recursive_display(head);
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

        Node temp=head;
        while (pos>1)
        {
            pos--;
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        return head;
    }
}
