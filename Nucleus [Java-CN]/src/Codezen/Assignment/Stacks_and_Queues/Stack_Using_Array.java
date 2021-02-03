package Codezen.Assignment.Stacks_and_Queues;

import java.util.Scanner;

public class Stack_Using_Array {
    static Scanner scan=new Scanner(System.in);
    private int[] data_array;
    private int top;

    Stack_Using_Array(int size)
    {
        data_array=new int[size];
        top=-1;
    }

    Stack_Using_Array()
    {
        data_array=new int[20];
        top=-1;
    }

    private void grow()
    {
        int[] temp=data_array;
        data_array=new int[data_array.length*2];
        int i=0;
        while (i<temp.length)
        {
            data_array[i]=temp[i];
            i++;
        }
    }

    void push(int data) {
        if(top==data_array.length-1)
        {
            grow();
        }
        data_array[++top]=data;
    }

    int pop() throws Exception {
        if(top==-1)
        {
            throw new Exception();
        }

        return data_array[top--];
    }

    int peek() throws Exception {
        if(top==-1)
        {
            throw new Exception();
        }

        return data_array[top];
    }

    int getSize()
    {
        return top+1;
    }

    boolean is_full()
    {
        return top==data_array.length-1?true:false;
    }

    boolean is_empty()
    {
        return top==-1?true:false;
    }

    public static void main(String[] args) {
        Stack_Using_Array my_stack=create_stack();
        print_Stack(my_stack);
    }

    public static Stack_Using_Array create_stack()
    {
        int elements=scan.nextInt();
        Stack_Using_Array my_stack=new Stack_Using_Array(elements);
        int i=0,data;
        while (i<elements)
        {
            data=scan.nextInt();
            my_stack.push(data);
            i++;
        }
        return my_stack;
    }

    public static void print_Stack(Stack_Using_Array stack)
    {
        try
        {
            while (!stack.is_empty())
            {
                System.out.print(stack.pop()+" ");
            }
        }
        catch (Exception e)
        {
            return ;
        }
    }
}
