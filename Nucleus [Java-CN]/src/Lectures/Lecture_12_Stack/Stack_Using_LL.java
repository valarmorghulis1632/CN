package Lectures.Lecture_12_Stack;

/**
 * Created by Ayush Deshwal on 18/07/2017.
 */
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data=data;
        next=null;
    }
}
public class Stack_Using_LL {
    private Node top;
    private int size;

    Stack_Using_LL()
    {
        top=null;
        size=0;
    }

    void push(int data)
    {
        Node n=new Node(data);
        n.next= top;
        top =n;
        size++;
    }

    int pop() throws Exception
    {
        if(top ==null)
        {
            throw new Exception();
        }
        int temp= top.data;
        top = top.next;
        size--;
        return temp;
    }

    boolean isempty()
    {
        return top ==null?true:false;
    }

    int peek()
    {
        return top.data;
    }

    int getSize() { return size; }

    public static void main(String[] args) throws Exception
    {
        Stack_Using_LL mystack=new Stack_Using_LL();
        mystack.push(5);
        mystack.push(6);
        mystack.push(7);
        try
        {
            System.out.println("   "+mystack.pop());
        }
        catch(Exception e)
        {
            throw e;
        }
    }
}
