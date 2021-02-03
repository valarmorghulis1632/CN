package Codezen.Assignment.Stacks_and_Queues;


import java.util.Scanner;

public class Check_Redundant_Brackets {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(checkRedundantBrackets(scan.nextLine()));
    }

//    public static boolean check_redundant_brackets(String str) {
//        int i=0,count=0,temp=0;
//        Stack_Using_Array stack=new Stack_Using_Array();
//        while (i<str.length())
//        {
//            if(str.charAt(i)=='(')
//            {
//                if(stack.is_empty())
//                {
//                    stack.push('(');
//                    temp=i;
//                }
//                else
//                {
//                    if(Math.abs(temp-i)<=1)
//                    {
//                        stack.push('(');
//                        temp=i;
//                    }
//                    else
//                    {
//                        return false;
//                    }
//                }
//            }
//            else if(str.charAt(i)==')')
//            {
//                try
//                {
//                    char ch= (char) stack.peek();
//                    if(ch=='(' && Math.abs(temp-i)<=1)
//                    {
//                        count++;
//                        stack.pop();
//                        return true;
//                    }
//                    if(ch=='(' && Math.abs(temp-i)>1)
//                    {
//                        stack.pop();
//                        temp=i;
//                        count++;
//                    }
//                }
//                catch (Exception e)
//                {
//                    return false;
//                }
//            }
//            i++;
//            if(count>=2)
//            {
//                return true;
//            }
//        }
//        return false;
//    }

    public static boolean checkRedundantBrackets(String input) {
        int x = 0, count = 0;
        while (x < input.length() - 1) {
            if (input.charAt(x) == '(') {
                if (input.charAt(x + 1) == ')') {
                    return true;
                }
            }
            x++;
        }
        x = 0;
        while (x < input.length() - 1) {
            if (input.charAt(x) == '(') {
                if (input.charAt(x + 1) == '(') {
                    count++;
                    break;
                }
            }
            x++;
        }
        x = 0;
        while (x < input.length() - 1) {
            if (input.charAt(x) == ')') {
                if (input.charAt(x + 1) == ')') {
                    count--;
                    break;
                }
            }
            x++;
        }
        if (count == 0) {
            return true;
        } else {
            return false;
        }
    }
}
