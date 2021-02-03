/**QUESTION -
 * Write a program to input a number and print the sum of all it’s
 even digits and sum of all its odd digits separately.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Even_Sum_Odd_Sum {
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
       System.out.print("ENTER THE NUMBER: ");
       int num=scan.nextInt();
       int evendigsum=0,odddigsum=0,dig=0;
       while(num>0) {
           dig = num % 10;
           if (dig % 2 == 0)
               evendigsum = evendigsum + dig;
           else odddigsum = odddigsum + dig;
           num = num / 10;
       }

        System.out.println("\nTHE SUM OF EVEN DIGITS APPEARING IN "+num+" : "+evendigsum);
        System.out.println("THE SUM OF ODD DIGITS APPEARING IN "+num+" : "+odddigsum);
    }
}
