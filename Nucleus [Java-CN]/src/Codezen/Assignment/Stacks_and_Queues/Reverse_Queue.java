package Codezen.Assignment.Stacks_and_Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Reverse_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue=create_queue();
        print_queue(reverse_queue(queue));
    }

    public static Queue<Integer> create_queue()
    {
        Scanner scan=new Scanner(System.in);
        int elements=scan.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        int i=0;
        while (i<elements)
        {
            int data=scan.nextInt();
            queue.add(data);
            i++;
        }
        return queue;
    }

    public static <T> void print_queue(Queue<T> queue)
    {
        while (!queue.isEmpty())
        {
            System.out.print(queue.remove()+" ");
        }
    }

    public static <T> Queue<T> reverse_queue(Queue<T> queue)
    {
        if(queue.isEmpty())
        {
            return queue;
        }
        T temp=queue.remove();
        queue=reverse_queue(queue);
        queue.add(temp);
        return queue;
    }
}
