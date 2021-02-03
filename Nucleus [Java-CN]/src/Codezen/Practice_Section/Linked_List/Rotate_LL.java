package Codezen.Practice_Section.Linked_List;

import java.util.Scanner;

public class Rotate_LL {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(rotate_LL(head,scan.nextInt()));
    }

    public static <T> Node<T> rotate_LL(Node<T> head,int n)
    {
        Node<T> temp=head;
        int count=1;
        while (temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        temp.next=head;
        temp=head;
        int i=1;
        if(count-n>0)
        {
            while (i<Math.abs(count-n))
            {
                temp=temp.next;
                i++;
            }
        }
        else
        {
            while (i<(count)+(count-n))
            {
                temp=temp.next;
                i++;
            }
        }
        head=temp.next;
        temp.next=null;
        return head;
    }
}
