/**
 * Write a program to find square root of an input.
 a. Just find the integral part
 b. Find the square root with an accuracy of n decimal
 points, n is provided by the user.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2B;
//DOUBT
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Sqr_Root_Upto_N_Decimal_places {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER: ");
        double num=scan.nextDouble();
        System.out.println("\nENTER THE CHOICE (a or b): ");
        char choice=scan.next().charAt(0);
        switch (choice) {
            case 'a':
                long integralpart = (long) Math.sqrt(num);
                System.out.println("INTEGRAL PART IS: " + integralpart);
                break;

            case 'b':
                System.out.println("ENTER THE ACCURACY UPTO WHICH DECIMAL PLACES ARE REQUIRED: ");
                long n = scan.nextLong();
                double sqroot = Math.sqrt(num);
                int i = 1;
                while (i <= n) {
                    sqroot = sqroot * 10;
                    i++;
                }
                long square = (long) sqroot;
                i = 1;
                double squareroot = (double) square;
                while (i <= n) {
                    squareroot = squareroot / 10;
                    i++;
                }
                System.out.println("\nSQUAREROOT UPTO GIVEN PLACES OF ACCURACY IS: " + squareroot);
                break;


            default:
                System.out.println("******INVALID CHOICE*****");
        }
        //System.out.println((double)25678);
    }
}
