package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/07/2017.
 */
public class Append_Last_N_to_First {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(append_last_n_to_first(head,scan.nextInt()));
    }

    public static Node<Integer> append_last_n_to_first(Node<Integer> head,int n)
    {
        Node temp=head;
        Node tail=head;
        int count=1;
        try
        {
            while (tail.next!=null)
            {
                tail=tail.next;
                count++;
            }
        }
        catch(NullPointerException e)
        {

        }
        if(count<n || count==1 || n<0)
        {
            return null;
        }
        int i=1;
        while (i<count-n)
        {
            temp=temp.next;
            i++;
        }
        tail.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
}
