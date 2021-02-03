/**QUESTION -
 * Write the programs to print the following patterns:
 a. 1
    11
    111
    1111
    11111
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;



/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_1 {
    public static void main(String[] args)
    {

        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number of rows: ");
        int row=s.nextInt();
        int i=1,j;
        System.out.println("\nThe Output is: \n");
        while(i<=row)
        {
            j = 1;
            while(j<=i) {
                System.out.print("1 ");
                j++;
            }
            System.out.println("");
            i++;
        }

    }
}
