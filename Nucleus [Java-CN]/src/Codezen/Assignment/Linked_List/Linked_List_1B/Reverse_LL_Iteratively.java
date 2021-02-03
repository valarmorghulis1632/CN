package Codezen.Assignment.Linked_List.Linked_List_1B;

/**
 * Created by Ayush Deshwal on 14/07/2017.
 */
public class Reverse_LL_Iteratively {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(reverse_LL_iteratively(head));
    }

    public static Node reverse_LL_iteratively(Node head)
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
}
