package Codezen.Practice_Section.Linked_List;

public class Last_The_First {
    public static void main(String[] args) {
        Node head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(last_the_first(head));
    }

    public static Node last_the_first(Node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        Node temp=head;
        while (temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next.next=head;
        head=temp.next;
        temp.next=null;
        return head;
    }
}
