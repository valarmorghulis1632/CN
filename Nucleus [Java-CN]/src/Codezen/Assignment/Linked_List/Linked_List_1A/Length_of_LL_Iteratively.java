package Codezen.Assignment.Linked_List.Linked_List_1A;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Length_of_LL_Iteratively {
    public static void main(String[] args) {
        Node head = Creation_Display_of_LL.create_LL();
        System.out.println("LENGTH IS: "+count(head));
    }

    public static int count(Node head)
    {
        int count=0;
        while(head!=null)
        {
            count++;
            head=head.next;
        }
        return count;
    }
}
