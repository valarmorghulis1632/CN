package Codezen.Assignment.Linked_List.Linked_List_1A;


/**
 * Created by Ayush Deshwal on 13/07/2017.
 */
public class Merge_2_Sorted_LL {
    public static void main(String[] args) {
        Node head_1=Creation_Display_of_LL.create_LL();
        Node head_2=Creation_Display_of_LL.create_LL();
        Node head_3=merge_2_sorted_LL(head_1,head_2);
        Creation_Display_of_LL.recursively_print(head_3);
    }

    public static Node merge_2_sorted_LL(Node<Integer> head_1,Node<Integer> head_2)
    {
        Node head_3=null;
        Node tail_3=null;

        while (head_1!=null && head_2!=null)
        {
            if((head_1.data.compareTo(head_2.data))==-1)
            {
                if(head_3==null)
                {
                    head_3=head_1;
                    tail_3=head_3;
                }
                else
                {
                    tail_3.next=head_1;
                    tail_3=tail_3.next;
                }
                head_1=head_1.next;
            }
            else
            {
                if(head_3==null)
                {
                    head_3=head_2;
                    tail_3=head_3;
                }
                else
                {
                    tail_3.next=head_2;
                    tail_3=tail_3.next;
                }
                head_2=head_2.next;
            }
        }

        tail_3.next=(head_1!=null)?head_1:head_2;
        return head_3;
    }
}
