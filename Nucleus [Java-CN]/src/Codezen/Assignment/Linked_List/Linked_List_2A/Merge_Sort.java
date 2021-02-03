package Codezen.Assignment.Linked_List.Linked_List_2A;


/**
 * Created by Ayush Deshwal on 15/07/2017.
 */
public class Merge_Sort {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(merge_sort(head));
    }

    public static Node merge_sort(Node head)
    {
        if(head.next==null)
        {
            return head;
        }
        Node left=head;
        Node temp=head;
        Node temp_1=head;
        while(temp.next!=null && temp.next.next!=null)
        {
            temp=temp.next.next;
            temp_1=temp_1.next;
        }
        Node right=temp_1.next;
        temp_1.next=null;
        left=merge_sort(left);
        right=merge_sort(right);
        return merge_2_sorted_LL(left,right);
    }

    public static Node merge_2_sorted_LL(Node head_1,Node head_2)
    {
        Node head_3=null;
        Node tail_3=null;

        while (head_1!=null && head_2!=null)
        {
            if((Integer)head_1.data < (Integer)head_2.data)
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
