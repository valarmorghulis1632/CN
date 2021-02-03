package Codezen.Assignment.Linked_List.Linked_List_2A;

/**
 * Created by Ayush Deshwal on 17/07/2017.
 */
public class Even_After_Odd_LL {
    public static void main(String[] args) {
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(even_after_odd_LL(head));
    }

    public static Node<Integer> even_after_odd_LL(Node<Integer> head)
    {
        Node<Integer> temp=head;
        Node<Integer> head_1=null;
        Node<Integer> tail_1=null;
        Node<Integer> head_2=null;
        Node<Integer> tail_2=null;
        while (temp!=null)
        {
            if(temp.data%2!=0)
            {
                Node<Integer> n=new Node<>(temp.data);
                if(head_1==null)
                {
                    head_1=n;
                    tail_1=head_1;
                }
                else
                {
                    tail_1.next=n;
                    tail_1=tail_1.next;
                }
            }
            temp=temp.next;
        }
        System.out.println("");
        temp=head;
        while(temp!=null)
        {
            if (temp.data%2==0)
            {
                Node<Integer> n=new Node<>(temp.data);
                if(head_2==null)
                {
                    head_2=n;
                    tail_2=head_2;
                }
                else
                {
                    tail_2.next=n;
                    tail_2=tail_2.next;
                }
            }
            temp=temp.next;
        }
        tail_1.next=head_2;
        return head_1;
    }
}
