package Lectures.Lecture_11_Linked_List;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Reverse_LL {
    public static void main(String[] args) {
        Node head=Creation_Display_LL.create_linked_list();
//        Creation_Display_LL.recursive_display(reverse_LL_iterative(head));
        Node temp=head;
        Node r=null;
        head=reverse_LL_recursively(head,temp,r);
        Creation_Display_LL.recursive_display(head);
    }

    public static Node reverse_LL_iterative(Node head)
    {
        Node temp=head;
        Node r=null;

        while(head.next!=null)
        {
            head=head.next;
            temp.next=r;
            r=temp;
            temp=head;
        }

        head.next=r;
        return head;
    }

    public static Node reverse_LL_recursively(Node head,Node temp,Node r)
    {
        if(head.next==null)
        {
            head.next=r;
            return head;
        }

        head=head.next;
        temp.next=r;
        r=temp;
        temp=head;

        return reverse_LL_recursively(head, temp, r);
    }
}
