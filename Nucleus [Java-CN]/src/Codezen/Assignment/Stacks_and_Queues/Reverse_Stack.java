package Codezen.Assignment.Stacks_and_Queues;

public class Reverse_Stack {
    public static void main(String[] args) {
        Stack_Using_Array stack_1=Stack_Using_Array.create_stack();
        Stack_Using_Array stack_2=new Stack_Using_Array(stack_1.getSize());
        stack_1=reverse_stack(stack_1,stack_2);
        Stack_Using_Array.print_Stack(stack_1);
    }

    public static Stack_Using_Array reverse_stack(Stack_Using_Array stack_1,Stack_Using_Array stack_2)
    {
        try
        {
            while (!stack_1.is_empty())
            {
                stack_2.push(stack_1.pop());
            }
        }
        catch(Exception e)
        {

        }
        return recursively_pop(stack_1,stack_2);
    }

    public static Stack_Using_Array recursively_pop(Stack_Using_Array stack_1,Stack_Using_Array stack_2)
    {
        if(stack_2.is_empty())
        {
            return stack_1;
        }
        int temp;
        try { temp=stack_2.pop(); }
        catch (Exception e)
        {
            return stack_1;
        }
        stack_1=recursively_pop(stack_1,stack_2);
        stack_1.push(temp);
        return stack_1;
    }
}
