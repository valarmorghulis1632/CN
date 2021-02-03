package Practice_Quests.Linked_List;
import java.util.Scanner;
class Node <T>
{
    T data;
    Node<T> next;

    Node (T data)
    {
        this.data= data;
    }
}
public class Intersection_of_2_LL {
    public static void main(String[] args) {
        Node<Integer> head_1=create_LL();
        Node<Integer> head_2=create_LL();
        if(check_intersection(head_1,head_2))
        {
            System.out.println("INTERSECTING ELEMENT IS : "+intersection_element(head_1,head_2));
        }
        else
        {
            System.out.println("NO INTERSCETION");
        }
    }

    public static boolean check_intersection(Node head_1 ,Node head_2 )
    {
        Node tail_1=head_1;
        Node tail_2=head_2;
        while (tail_1.next!=null)
        {
            tail_1=tail_1.next;
        }

        while (tail_2.next!=null)
        {
            tail_2=tail_2.next;
        }

        return tail_1==tail_2?true:false;
    }

    public static int intersection_element(Node<Integer> head_1,Node<Integer> head_2)
    {
        int len_1=length(head_1);
        int len_2=length(head_2);
        int diff=Math.abs(len_1-len_2);
        if(len_1>len_2)
        {
            int i=0;
            while(i<diff)
            {
                head_1=head_1.next;
                i++;
            }
        }
        else
        {
            int i=0;
            while(i<diff)
            {
                head_2=head_2.next;
                i++;
            }
        }
        while(head_1!=head_2)
        {
            head_1=head_1.next;
            head_2=head_2.next;
        }
        return head_1.data;
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

    public static Node create_LL()
    {
        Scanner scan=new Scanner(System.in);
        int data=scan.nextInt();
        Node head=null;
        Node tail=null;
        while(data!=-1)
        {
            Node n = new Node(data);
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

    public static void recursively_print(Node head)
    {
        if(head==null)
        {
            return;
        }
        System.out.print(head.data+" ");
        recursively_print(head.next);
    }
}


