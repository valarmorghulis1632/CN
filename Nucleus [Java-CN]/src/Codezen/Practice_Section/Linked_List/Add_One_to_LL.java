package Codezen.Practice_Section.Linked_List;

public class Add_One_to_LL {
    public static void main(String[] args) {
        Node<Integer> head=Creation_Display_of_LL.create_LL();
        Creation_Display_of_LL.recursively_print(add_one_to_LL(head,1));
    }

    public static Node<Integer> add_one_to_LL(Node<Integer> head,int count)
    {
        if(head==null)
        {
            Node<Integer> carry=new Node<>(1);
            return carry;
        }
        if(head.next==null)
        {
            Node<Integer> carry=new Node<>((head.data+1)/10);
            head.data=(head.data+1)%10;
            if(count==1)
            {
                return head;
            }
            return carry;
        }
        Node<Integer> ans=add_one_to_LL(head.next,count+1);
        Node<Integer> carry=new Node<>((head.data+ans.data)/10);
        head.data=(head.data+ans.data)%10;
        if(count==1)
        {
            if(carry.data!=0)
            {
                carry.next=head;
                head=carry;
                return head;
            }
            else
            {
                return head;
            }
        }
        else
        {
            return carry;
        }
    }
}
