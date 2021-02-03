/**
 * f. 11111
      0000
      111
      00
      1
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ROWS: ");
        int row=scan.nextInt();
        System.out.println("");
        int i=1,j;
        while(i<=row) {
            j = row - i + 1;
            while (j >= 1) {
                if (i % 2 == 0)
                    System.out.print(0 + " ");
                else System.out.print(1 + " ");
                j--;
            }
            i++;
            System.out.println("");
        }
    }
}
