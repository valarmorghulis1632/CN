package Codezen.Assignment.Linked_List.Linked_List_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
class Node <T>
{
     T data;
     Node <T> next;

      Node (T data)
     {
         this.data= data;
     }
}
public class Creation_Display_of_LL {
    public static void main(String[] args) {

        Node head = create_LL();
        recursively_print(head);
    }

    public static Node create_LL()
    {
        Scanner scan=new Scanner(System.in);
        int data=scan.nextInt();
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            Node n = new Node(data);
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

    public static void recursively_print(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        recursively_print(head.next);
    }
}
