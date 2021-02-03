package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/07/2017.
 */
public class Delete_Every_N_Nodes {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(delete_every_n_nodes(head,scan.nextInt(),scan.nextInt()));
    }

    public static Node<Integer> delete_every_n_nodes(Node<Integer> head,int m,int n)
    {
        if(head==null)
        {
            return head;
        }
        if(m==0)
        {
            return null;
        }
        if(n==0)
        {
            return head;
        }
        Node<Integer> temp_1=head;
        int i=1;
        try
        {
            while (i<m)
            {
                temp_1=temp_1.next;
                i++;
            }
        }
        catch(Exception e)
        {
            return head;
        }

        Node<Integer> temp_2;
        try {
            temp_2=temp_1.next;
        }
        catch(Exception e)
        {
            return head;
        }
        int j=0;
        try
        {
            while(j<n)
            {
                temp_2=temp_2.next;
                j++;
            }
        }
        catch (Exception e)
        {

        }
        temp_1.next=temp_2;
        delete_every_n_nodes(temp_2,m,n);
        return head;
    }
}
