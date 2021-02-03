package Codezen.Assignment.Linked_List.Linked_List_1B;

/**
 * Created by Ayush Deshwal on 14/07/2017.
 */
public class Mid_Point_LL {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        System.out.println("MID POINT : "+mid_point_LL(head));
    }

    public static int mid_point_LL(Node head)
    {
        Node temp=head;
        while(temp.next!=null && temp.next.next!=null)
        {
            temp=temp.next.next;
            head=head.next;
        }
        return (Integer) head.data;
    }
}
