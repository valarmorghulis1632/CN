package Codezen.Assignment.Linked_List.Linked_List_1B;

/**
 * Created by Ayush Deshwal on 14/07/2017.
 */
public class Palindrome_LL {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        System.out.println(is_palindrome_LL(head));
    }

    public static boolean is_palindrome_LL(Node head)
    {
        Node temp_1=head;
        Node temp_2=head;
        while(temp_2.next!=null)
        {
            temp_2=temp_2.next;

        }
        while(temp_1!=temp_2 && temp_2.next!=temp_1)
        {
            if ((Integer) temp_1.data != (Integer) temp_2.data)
            {
                return false;
            }
            Node temp_3 = temp_1;
            while (temp_3.next != temp_2)
            {
                temp_3=temp_3.next;
            }
            System.out.println(temp_2.data+" "+temp_3.data);
            temp_2=temp_3;
            temp_1 = temp_1.next;
        }
        return true;
    }
}
