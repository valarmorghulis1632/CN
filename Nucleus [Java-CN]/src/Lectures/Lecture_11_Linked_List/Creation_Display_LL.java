package Lectures.Lecture_11_Linked_List;


import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */

class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
    }
}

/**
 * Time Complexity O(n)
 */
public class Creation_Display_LL {
    public static void main(String[] args)
    {
        Node head=create_linked_list();
       print_linked_list(head);
       System.out.println("\n");
       recursive_display(head);
    }

    public static Node create_linked_list()
    {
        Scanner scan=new Scanner(System.in);
        int data=scan.nextInt();
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            Node n=new Node(data);
            if(head==null)
            {
                head=n;
                tail=n;
            }
            else
            {
                tail.next=n;
                tail=tail.next;
            }
            data=scan.nextInt();
        }
        return head;
    }

    public static void print_linked_list(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    /**
     * Recursive display method
     */

    public static void recursive_display(Node head)
    {
        if(head.next==null)
        {
            System.out.print(head.data+" ");
            return;
        }

        System.out.print(head.data+" ");
        recursive_display(head.next);
    }
}
