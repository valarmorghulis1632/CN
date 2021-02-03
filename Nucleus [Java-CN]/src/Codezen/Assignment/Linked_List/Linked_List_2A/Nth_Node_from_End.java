package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

public class Nth_Node_from_End {
    public static void main(String[] args) {
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Scanner scan=new Scanner(System.in);
        System.out.println("NODE IS: "+(nth_node_from_end(head,scan.nextInt())).data);
    }

    public static Node<Integer> nth_node_from_end(Node<Integer> head,int n)
    {
        Node<Integer> temp_1=head;
        Node<Integer> temp_2=head;
        int i=0;
        try
        {
            while(i<=n)
            {
                temp_1=temp_1.next;
                i++;
            }
            while (temp_1!=null)
            {
                temp_1=temp_1.next;
                temp_2=temp_2.next;
            }
        }
        catch(Exception e)
        {
            return null;
        }
        return temp_2;
    }
}
