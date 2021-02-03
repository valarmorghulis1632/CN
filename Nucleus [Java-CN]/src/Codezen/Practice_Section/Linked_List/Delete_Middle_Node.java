package Codezen.Practice_Section.Linked_List;

public class Delete_Middle_Node {
    public static void main(String[] args) {
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(delete_middle_node(head));
    }

    public static Node<Integer> delete_middle_node(Node<Integer> head)
    {
        if(head==null)
        {
            return null;
        }
        Node<Integer> prev=null;
        Node<Integer> temp_1=head;
        Node<Integer> temp_2=head;
        while(temp_2.next!=null && temp_2.next.next!=null)
        {
            prev=temp_1;
            temp_1=temp_1.next;
            temp_2=temp_2.next.next;
        }
        if(temp_1==head)
        {
            if(temp_1.next!=null)
            {
                return temp_1.next;
            }
            else
            {
                return null;
            }
        }
        prev.next=temp_1.next;
        temp_1.next=null;
        return head;
    }
}
