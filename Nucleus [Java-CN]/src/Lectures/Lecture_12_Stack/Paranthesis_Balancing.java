package Lectures.Lecture_12_Stack;

import java.util.Scanner;

class Stack_Paranthesis
{
    private int top;
    private char[] char_array;

    Stack_Paranthesis(int length)
    {
        top=-1;
        char_array=new char[length];
    }

    private void grow()
    {
        char[] temp=char_array;
        char_array=new char[char_array.length*2];
        int i=0;
        while (i<temp.length)
        {
            char_array[i]=temp[i];
            i++;
        }
    }

    void push(char data)
    {
        if(top==char_array.length-1)
        {
            grow();
        }
        char_array[++top]=data;
    }

    char pop() throws Exception {
        if(top==-1)
        {
            throw new Exception();
        }

        return char_array[top--];
    }

    boolean is_empty()
    {
        return top==-1?true:false;
    }
}

public class Paranthesis_Balancing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("ARE PARANTHESIS BALANCED: "+paranthesis_balancing(str));
    }

    public static boolean paranthesis_balancing(String str)
    {
        Stack_Paranthesis my_stack=new Stack_Paranthesis(str.length());
        int i=0;
        while(i<str.length())
        {
            if (str.charAt(i)=='(')
            {
                my_stack.push(str.charAt(i));
            }
            else if(str.charAt(i)=='[')
            {
                my_stack.push(str.charAt(i));
            }
            else if (str.charAt(i)=='{')
            {
                my_stack.push(str.charAt(i));
            }
            else if(str.charAt(i)==')')
            {
                try
                {
                    char ch=my_stack.pop();
                    if(ch!='(')
                    {
                        return false;
                    }
                }
                catch(Exception e)
                {
                    return false;
                }

            }
            else if(str.charAt(i)==']')
            {
                try
                {
                    char ch=my_stack.pop();
                    if(ch!='[')
                    {
                        return false;
                    }
                }
                catch(Exception e)
                {
                    return false;
                }
            }
            else if(str.charAt(i)=='}')
            {
                try
                {
                    char ch=my_stack.pop();
                    if(ch!='{')
                    {
                        return false;
                    }
                }
                catch(Exception e)
                {
                    return false;
                }
            }
            i++;
        }
        if(my_stack.is_empty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
