package Codezen.Assignment.Linked_List.Linked_List_1A;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Length_of_LL_Recursively {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        System.out.println("LENGTH IS: "+length_of_LL_recursively(head));
    }

    public static int length_of_LL_recursively(Node temp)
    {
        if(temp==null)
        {
            return 0;
        }
        return 1+length_of_LL_recursively(temp.next);
    }
}
