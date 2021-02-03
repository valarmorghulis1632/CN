package Lectures.Lecture_13_Queues;

public class Queue_Using_LL {
    private Node front=null;
    private Node rear=null;
    private int size=0;

    void enqueue(int data)
    {
        Node n=new Node(data);
        if(size==0)
        {
            front=n;
            rear=n;
        }
        else
        {
            rear.next=n;
            rear=rear.next;
        }
        size++;
    }

    int dequeue() throws Exception {
        if(is_empty())
        {
            throw new Exception();
        }
        if(size==1)
        {
            int temp=front.data;
            front=null;
            rear=null;
            size--;
            return temp;
        }
        else
        {
            int temp=front.data;
            front=front.next;
            size--;
            return temp;
        }
    }

    boolean is_empty()
    {
        return size==0?true:false;
    }

    int getSize() { return size;}

    public static void main(String[] args) {

        Queue_Using_LL my_queue=new Queue_Using_LL();

        my_queue.enqueue(5);
        my_queue.enqueue(6);
        my_queue.enqueue(7);
        my_queue.enqueue(8);
        my_queue.enqueue(9);
        my_queue.enqueue(10);
        my_queue.enqueue(10);

        try
        {
            System.out.println(my_queue.dequeue());
            System.out.println(my_queue.dequeue());
            System.out.println(my_queue.dequeue());
            System.out.println(my_queue.dequeue());
            System.out.println(my_queue.dequeue());
            System.out.println(my_queue.dequeue());
            System.out.println(my_queue.dequeue());
        }
        catch(Exception e)
        {
            System.out.println("EMPTY");
        }
    }
}
