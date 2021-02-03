package Codezen.Assignment.Linked_List.Linked_List_2A;

/**
 * Created by Ayush Deshwal on 15/07/2017.
 */
public class Bubble_Sort {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(bubble_sort_1(head));
    }

    public static Node bubble_sort(Node<Integer> head)
    {
        Node tail=null;
        Node ans=head;
        while(tail!=ans)
        {
            Node<Integer> temp_2=ans;
            while (temp_2.next!=tail)
            {
                if(temp_2.data.compareTo(temp_2.next.data)==1)
                {
                    ans = swap_2_nodes_in_LL(ans, temp_2,temp_2.next);
                }
                else
                {
                    temp_2=temp_2.next;
                }
            }
            tail=temp_2;
        }
        return ans;
    }

    public static Node<Integer> bubble_sort_1(Node<Integer> head)
    {
        int n=length(head);
        int i,j;
        for(i=0;i<n-1;i++)
        {
            Node<Integer> prev=null;
            Node<Integer> curr=head;
            for (j=0;j<n-i-1;j++)
            {
                if(curr.data.compareTo(curr.next.data)==1)
                {
                    if(prev==null)
                    {
                        prev=curr.next;
                        curr.next=prev.next;
                        prev.next=curr;
                        head=prev;
                    }
                    else
                    {
                        prev.next=curr.next;
                        prev=prev.next;
                        curr.next=prev.next;
                        prev.next=curr;
                    }
                }
                else
                {
                    prev=curr;
                    curr=curr.next;
                }
            }
        }
        return head;
    }

    public static Node bubble_sort_2(Node<Integer> head)
    {
        Node tail=null;
        while(tail!=head)
        {
            Node<Integer> temp_2=head;
            while (temp_2.next!=tail)
            {
                if(temp_2.data.compareTo(temp_2.next.data)==1)
                {
                    int swap=temp_2.data;
                    temp_2.data=temp_2.next.data;
                    temp_2.next.data=swap;
                }
                temp_2=temp_2.next;
                Creation_Display_of_LL.recursively_print(head);
                System.out.println("");
            }
            tail=temp_2;
        }
        return head;
    }

    public static int length(Node<Integer> head)
    {
        Node<Integer> tail=head;
        int count=0;
        while (tail!=null)
        {
            count++;
            tail=tail.next;
        }
        return count;
    }

    public static Node swap_2_nodes_in_LL(Node head,Node t1,Node t2)
    {
        Node temp_1=head;
        Node temp_2=head;
        int i=0,j=0;
        while (temp_1!=t1)
        {
            i++;
            temp_1=temp_1.next;
        }
        while (temp_2!=t2)
        {
            j++;
            temp_2=temp_2.next;
        }
        temp_1=head;
        temp_2=head;
        int I=i;
        int J=j;
        try
        {

            while(I>1)
            {
                temp_1=temp_1.next;
                I--;
            }
            while (J>1)
            {
                temp_2=temp_2.next;
                J--;
            }
            if(Math.abs(i-j)>1) {
                if (i != 0 && j != 0) {
                    Node swap = temp_1.next;
                    Node f1 = temp_1.next.next;
                    Node f2 = temp_2.next.next;
                    temp_1.next = temp_2.next;
                    temp_1.next.next = f1;
                    temp_2.next = swap;
                    temp_2.next.next = f2;
                }
                else {
                    if (i == 0) {
                        Node f1 = temp_1.next;
                        Node swap = temp_2.next;
                        Node f2 = temp_2.next.next;
                        temp_2.next = temp_1;
                        temp_2.next.next = f2;
                        swap.next = f1;
                        head = swap;
                    }
                    else if (j == 0) {
                        Node f2 = temp_2.next;
                        Node swap = temp_1.next;
                        Node f1 = temp_1.next.next;
                        temp_1.next = temp_2;
                        temp_1.next.next = f1;
                        swap.next = f2;
                        head = swap;
                    }
                }
            }
            else if(Math.abs(i-j)==1)
            {
                if(i!=0 && j!=0)
                {
                    if(j>i)
                    {
                        Node swap=temp_1.next;
                        Node f2=temp_2.next.next;
                        temp_1.next=temp_2.next;
                        temp_1.next.next=swap;
                        swap.next=f2;
                    }
                    else if(i>j)
                    {
                        Node swap=temp_2.next;
                        Node f1=temp_1.next.next;
                        temp_2.next=temp_1.next;
                        temp_2.next.next=swap;
                        swap.next=f1;
                    }
                }
                else
                {
                    if(i==0)
                    {
                        Node swap=temp_2.next;
                        Node f2=temp_2.next.next;
                        temp_1.next=f2;
                        swap.next=temp_1;
                        head=swap;
                    }
                    else if(j==0)
                    {
                        Node swap=temp_1.next;
                        Node f1=temp_1.next.next;
                        temp_2.next=f1;
                        swap.next=temp_2;
                        head=swap;
                    }
                }
            }
            else {}
        }
        catch (Exception e)
        {

        }
        return head;
    }
}
