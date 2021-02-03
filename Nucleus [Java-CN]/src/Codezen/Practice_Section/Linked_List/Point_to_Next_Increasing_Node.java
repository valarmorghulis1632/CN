package Codezen.Practice_Section.Linked_List;

import java.util.Scanner;

class Node_1
{
    int data;
    Node_1 next;
    Node_1 arbitrary;

    Node_1(int data)
    {
        this.data=data;
        next=null;
        arbitrary=null;
    }
}
public class Point_to_Next_Increasing_Node {
    public static void main(String[] args) {
        Node_1 head=create_LL();
        initialize_arbitrary_pointer(head);
        recursively_print(merge_sort(head));
    }

    public static Node_1 create_LL()
    {
        Scanner scan=new Scanner(System.in);
        int data=scan.nextInt();
        Node_1 head=null;
        Node_1 tail=null;
        while(data!=-1)
        {
            Node_1 n = new Node_1(data);
            if(head==null)
            {
                head=n;
                tail=n;
            }
            else
            {
                tail.next=n;
                tail=tail.next;
            }
            data=scan.nextInt();
        }
        return head;
    }

    public static void recursively_print(Node_1 head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        recursively_print(head.arbitrary);
    }

    public static Node_1 merge_sort(Node_1 head)
    {
        if(head.arbitrary==null)
        {
            return head;
        }
        Node_1 left=head;
        Node_1 temp=head;
        Node_1 temp_1=head;
        while(temp.arbitrary!=null && temp.arbitrary.arbitrary!=null)
        {
            temp=temp.arbitrary.arbitrary;
            temp_1=temp_1.arbitrary;
        }
        Node_1 right=temp_1.arbitrary;
        temp_1.arbitrary=null;
        left=merge_sort(left);
        right=merge_sort(right);
        return merge_2_sorted_LL(left,right);
    }

    public static void initialize_arbitrary_pointer(Node_1 head)
    {
        while (head!=null)
        {
            head.arbitrary=head.next;
            head=head.next;
        }
    }

    public static Node_1 merge_2_sorted_LL(Node_1 head_1,Node_1 head_2)
    {
        Node_1 head_3=null;
        Node_1 tail_3=null;

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
                    tail_3.arbitrary=head_1;
                    tail_3=tail_3.arbitrary;
                }
                head_1=head_1.arbitrary;
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
                    tail_3.arbitrary=head_2;
                    tail_3=tail_3.arbitrary;
                }
                head_2=head_2.arbitrary;
            }
        }

        tail_3.arbitrary=(head_1!=null)?head_1:head_2;
        return head_3;
    }
}
