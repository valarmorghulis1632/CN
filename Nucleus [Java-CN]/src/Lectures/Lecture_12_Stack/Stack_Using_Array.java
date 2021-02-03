package Lectures.Lecture_12_Stack;

public class Stack_Using_Array {
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

    boolean is_full()
    {
        return top==data_array.length-1?true:false;
    }

    boolean is_empty()
    {
        return top==-1?true:false;
    }

    public static void main(String[] args) throws Exception {
        Stack_Using_Array my_stack=new Stack_Using_Array(5);
        my_stack.push(5);
        my_stack.push(6);
        my_stack.push(7);
        my_stack.push(8);
        my_stack.push(9);
        my_stack.push(10);
        try
        {
            System.out.println(my_stack.pop());
            System.out.println(my_stack.pop());
            System.out.println(my_stack.pop());
            System.out.println(my_stack.pop());
            System.out.println(my_stack.pop());
            System.out.println(my_stack.pop());
            System.out.println(my_stack.pop());
        }
        catch (Exception e)
        {
            System.out.println("EMPTY");
        }
    }
}
