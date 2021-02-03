package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/07/2017.
 */
public class Rearrange_LL {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(rearrange_LL(head));
    }

    public static Node<Integer> rearrange_LL(Node<Integer> head)
    {
        if(head.next==null)
        {
            return head;
        }
        Node tail=head;
        Node tail_prev=null;
        while (tail.next!=null)
        {
            tail_prev=tail;
            tail=tail.next;
        }
        if(head==tail_prev )
        {
            return head;
        }
        Node temp=head.next;
        head.next=tail;
        tail_prev.next=null;
        tail.next=temp;
        rearrange_LL(temp);
        return head;
    }
}
