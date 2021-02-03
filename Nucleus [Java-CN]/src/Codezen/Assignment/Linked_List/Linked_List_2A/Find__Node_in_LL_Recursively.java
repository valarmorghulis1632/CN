package Codezen.Assignment.Linked_List.Linked_List_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/07/2017.
 */
public class Find__Node_in_LL_Recursively {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        System.out.println("INDEX IS: "+find_node_recursively(head,scan.nextInt()));
    }

    public static int find_node_recursively(Node<Integer> head,int num)
    {
        if(head==null)
        {
            return -1;
        }
        if(head.data.compareTo(num)==0)
        {
            return 0;
        }
        int ans=find_node_recursively(head.next,num);
        if(ans==-1)
        {
            return ans;
        }
        else
        {
            return ans+1;
        }
    }
}
