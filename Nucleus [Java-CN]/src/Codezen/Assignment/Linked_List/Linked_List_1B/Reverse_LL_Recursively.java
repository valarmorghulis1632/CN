package Codezen.Assignment.Linked_List.Linked_List_1B;

/**
 * Created by Ayush Deshwal on 14/07/2017.
 */
public class Reverse_LL_Recursively {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
//        Node temp=head;
//        Node r=null;
//        Creation_Display_of_LL.recursively_print(reverse_LL_recursively(head,temp,r));
//        Node temp=null;
//        Creation_Display_of_LL.recursively_print(reverse_LL_recursively_1(head,temp));
        Creation_Display_of_LL.recursively_print(reverse_LL_recursively_2(head));

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

    public static Node reverse_LL_recursively_1(Node head,Node temp)
    {
        if(head.next==null)
        {
            head.next=temp;
            return head;
        }

        Node ans=reverse_LL_recursively_1(head.next,head);
        head.next=temp;
        return ans;
    }

    public static Node reverse_LL_recursively_2(Node head)
    {
        if (head.next==null)
        {
            return head;
        }
        Node ans=reverse_LL_recursively_2(head.next);
        head.next.next=head;
        head.next=null;
        return ans;
    }


}
