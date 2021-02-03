/** QUESTION -
 * Write a program that asks the user for a number n and gives
 him the possibility to choose between computing the sum
 and computing the product of 1,...,n.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2B;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Sum_or_Prod_of_1_to_N {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER N: ");
        int num=scan.nextInt(),i,sum=0,product=1;
        System.out.print("\nCHOOSE WHETHER YOU WANT TO ADD OR MULTIPLY NUMBERS 1 TO N (add or multiply [lower case]): ");
        String choice=scan.next();
        switch (choice) {
            case "add":
                i = 1;
                while (i <= num) {
                    sum = sum + i;
                    i++;
                }
                System.out.println("\nSUM IS: " + sum);
                break;

            case "multiply":
                i = 1;
                while (i <= num) {
                    product = product * i;
                    i++;
                }
                System.out.println("\nPRODUCT IS: " + product);
                break;
            default:
                System.out.println("\n*****INVALID CHOICE*****");
        }
    }
}
