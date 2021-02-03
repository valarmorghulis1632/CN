package Codezen.Assignment.Linked_List.Linked_List_1B;

/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Eliminate_Duplicates_from_LL {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(eliminate_duplicates(head));
    }

    public static Node eliminate_duplicates(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            try
            {
                if(temp.data.equals(temp.next.data))
                {
                    Node temp_1=temp.next;
                    while(temp_1!=null && temp_1.data.equals(temp.data))
                    {
                        temp_1=temp_1.next;
                    }
                    temp.next=temp_1;
                    if(temp_1==null)
                    {
                        break;
                    }
                }
                Creation_Display_of_LL.recursively_print(head);
                System.out.println("");
                temp=temp.next;
            }
            catch (NullPointerException e)
            {
                break;
            }
        }

        return head;
    }


}
