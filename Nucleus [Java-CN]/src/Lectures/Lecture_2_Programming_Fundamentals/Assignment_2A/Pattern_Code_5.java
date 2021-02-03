/**QUESTION -
 * Write the programs to print the following patterns:
 * e. 5432*
      543*1
      54*21
      5*321
      *4321
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS: ");
        int row=scan.nextInt();
        System.out.println("");
        int i=1,j;
        while(i<=row) {
            j = row;
            while (j >= 1) {
                if (j == i)
                    System.out.print("* ");
                else System.out.print(j + " ");
                j--;
            }
            System.out.println("");
            i++;
        }
    }
}
