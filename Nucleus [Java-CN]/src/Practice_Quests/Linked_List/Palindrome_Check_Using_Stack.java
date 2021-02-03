package Practice_Quests.Linked_List;
class Stack
{
    private Node<Integer> top=null;

    void push(int data)
    {
        Node n=new Node(data);
        n.next= top;
        top =n;
    }

    int pop() throws Exception {
        if(top ==null)
        {
            throw new Exception();
        }
        int temp= top.data;
        top = top.next;
        return temp;
    }
}

public class Palindrome_Check_Using_Stack
{
    public static void main(String[] args) {
        Node<Integer> head=Intersection_of_2_LL.create_LL();
        System.out.println(is_palindrome(head));
    }

    public static boolean is_palindrome(Node<Integer> head)
    {
        Node<Integer> temp=head;
        Stack my_stack=new Stack();
        while (temp!=null)
        {
            my_stack.push(temp.data);
            temp=temp.next;
        }
        while (head!=null)
        {
            try
            {
                if(head.data.compareTo(my_stack.pop())!=0)
                {
                    return false;
                }
            }
            catch (Exception e)
            {
                if(head==null)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            head=head.next;
        }
        return true;
    }
}
