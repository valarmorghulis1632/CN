package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/07/2017.
 */
public class K_Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(k_reverse(head,scan.nextInt()));
    }

    public static Node<Integer> k_reverse(Node<Integer> head,int k)
    {
        Node<Integer> temp=head;
        Node<Integer> ans=null;
        Node<Integer> prev=null;
        while(temp!=null)
        {
            Node temp_2=temp;
            int i=1;
            try
            {
                while(i<k)
                {
                    temp=temp.next;
                    i++;
                }
            }
            catch(NullPointerException e)
            {
                Node<Integer> temp_3=temp_2;
                while (temp_3.next!=temp)
                {
                    temp_3=temp_3.next;
                }
                temp=temp_3;
            }
            Node temp_1=null;
            try
            {
                temp_1=temp.next;
            }
            catch(NullPointerException e)
            {
                Node<Integer> temp_3=temp_2;
                while (temp_3.next!=temp)
                {
                    temp_3=temp_3.next;
                }
                temp=temp_3;
                temp_1=null;
            }
            temp.next=null;
            if(ans==null)
            {
                ans=reverse_LL_recursively_2(temp_2);
                head=ans;
                temp_2.next=temp_1;
                prev=temp_2;
            }
            else
            {
                ans=reverse_LL_recursively_2(temp_2);
                prev.next=ans;
                prev=temp_2;
            }
            temp=temp_1;
        }
        return head;
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











