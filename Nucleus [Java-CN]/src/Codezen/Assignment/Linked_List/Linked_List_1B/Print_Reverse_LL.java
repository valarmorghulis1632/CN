package Codezen.Assignment.Linked_List.Linked_List_1B;

/**
 * Created by Ayush Deshwal on 14/07/2017.
 */
public class Print_Reverse_LL {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        print_reverse_LL(head);
    }

    public static void print_reverse_LL(Node head)
    {
        if(head==null)
        {
            return;
        }

        print_reverse_LL(head.next);
        System.out.print(head.data+" ");
    }
}
