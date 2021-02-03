package Codezen.Assignment.Linked_List.Linked_List_1B;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/07/2017.
 */
public class Swap_2_Nodes_in_LL {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node head=Creation_Display_of_LL.create_LL();
        int i=scan.nextInt();
        int j=scan.nextInt();
        Creation_Display_of_LL.recursively_print(swap_2_nodes_at_i_and_j(head,i,j));
//        Node temp=head.next.next;
//        Creation_Display_of_LL.recursively_print(swap_2_nodes_in_LL(head,temp,temp.next.next));
    }

    public static Node swap_2_nodes_in_LL(Node head,Node t1,Node t2)
    {
        Node temp_1=head;
        Node temp_2=head;
        int i=0,j=0;
        try
        {
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
        }
        catch (NullPointerException e)
        {
            return head;
        }
        System.out.println(i+" "+j);
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

    public static Node swap_2_nodes_at_i_and_j(Node head,int i,int j)
    {
        Node temp_1=head;
        Node temp_2=head;
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
