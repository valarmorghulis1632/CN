package Codezen.Assignment.Programming_Fundamentals;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
public class Nth_Fibonacci_Element {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER THE NTH POSITION: ");
        int num = scan.nextInt();
        System.out.println("\n");
        int number = fib_calc(num - 1);
        System.out.println("FIBONACCI NTH ELEMENT: " + number);
    }

    public static int fib_calc(int num)
    {
        if(num==1 || num==0)
            return 1;
        else return (fib_calc(num-1)+fib_calc(num-2));
    }
}
