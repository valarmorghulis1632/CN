/**QUESTION -
 * Given a binary number convert it into decimal.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2B;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Binary_To_Decimal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE BINARY NUMBER: ");
        long binarynumber=scan.nextLong(),dig,i=0,decimalnumber=0;
        long n=binarynumber;
        while(n>0) {
            dig = n % 10;
            decimalnumber = decimalnumber + ((long)(Math.pow(2,i)) * dig);
            i++;
            n = n / 10;
        }
        System.out.println("\nDECIMAL EQUIVALENT OF BINARY NUMBER "+binarynumber+" IS: "+decimalnumber);
    }
}
