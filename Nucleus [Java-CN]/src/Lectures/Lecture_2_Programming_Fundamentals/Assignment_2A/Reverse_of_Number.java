/**QUESTION -
 * Write a program to generate the reverse of a given number.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Reverse_of_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num=scan.nextInt();
        int dig=0,rev=0,n;
        n=num;
        while(n>0) {
            dig = n % 10;
            rev = dig + (rev * 10);
            n = n/10;
        }
        System.out.println("THE REVERSE OF GIVEN NUMBER "+num+" IS: "+rev);
    }
}
