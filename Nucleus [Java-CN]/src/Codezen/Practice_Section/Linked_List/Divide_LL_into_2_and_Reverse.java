package Codezen.Practice_Section.Linked_List;

public class Divide_LL_into_2_and_Reverse {
    public static void main(String[] args) {
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        divide_and_reverse(head);
    }

    public static void divide_and_reverse(Node<Integer> head)
    {
        Node<Integer> temp=head;
        Node<Integer> head_1=null;
        Node<Integer> tail_1=null;
        Node<Integer> head_2=null;
        Node<Integer> tail_2=null;
        int i=1;
        while (temp!=null)
        {
            if(i%2!=0)
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
            i++;
        }
        System.out.println("");
        temp=head;
        i=1;
        while(temp!=null)
        {
            if (i%2==0)
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
            i++;
        }
        Creation_Display_of_LL.recursively_print(reverse_LL_recursively_2(head_1));
        System.out.println("");
        Creation_Display_of_LL.recursively_print(reverse_LL_recursively_2(head_2));
    }

    public static Node reverse_LL_recursively_2(Node head)
    {
        if (head.next==null)
        {
            return head;
        }
        Node ans=reverse_LL_recursively_2(head.next);
        head.next.next=head;
        head.next=null;
        return ans;
    }
}
