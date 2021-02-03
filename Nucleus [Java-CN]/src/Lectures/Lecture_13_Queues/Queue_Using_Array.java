package Lectures.Lecture_13_Queues;

public class Queue_Using_Array {
    private int[] data_array;
    private int front;
    private int rear;
    private int size;

    Queue_Using_Array(int size)
    {
        data_array=new int[size];
        front=-1;
        rear=-1;
        size=0;
    }

    Queue_Using_Array()
    {
        data_array=new int[20];
        front=-1;
        rear=-1;
        size=0;
    }

    private void grow()
    {
        int[] temp=data_array;
        data_array=new int[data_array.length*2];
        int i=0;
        while (i<temp.length)
        {
            if(i==0)
            {
                front=0;
            }
            data_array[i]=temp[i];
            rear=i;
            i++;
        }
    }

    void enqueue(int data) {
        if(is_full())
        {
            grow();
        }
        rear=(rear+1)%data_array.length;
        data_array[rear]=data;
        if(size==0)
        {
            front=rear;
        }
        size++;
    }

    int dequeue() throws Exception {
        if(size==0)
        {
            throw new Exception();
        }
        int temp=data_array[front];
        front=(front+1)%data_array.length;
        if(size==1)
        {
            rear=front;
        }
        size--;
        return temp;
    }

    int getSize() { return size; }

    boolean is_full()
    {
        return size==data_array.length?true:false;
    }

    boolean is_empty()
    {
        return size==0?true:false;
    }

    public static void main(String[] args) {

        Queue_Using_Array my_queue=new Queue_Using_Array(5);

        my_queue.enqueue(5);
        my_queue.enqueue(6);
        my_queue.enqueue(7);
        my_queue.enqueue(8);
        my_queue.enqueue(9);
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
        catch (Exception e)
        {
            System.out.println("UNDERFLOW");
        }
    }
}
