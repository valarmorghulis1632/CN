/**
 * c. 1
      11
      121
      1221
      12221
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int row=scan.nextInt();
        System.out.println("\n1 ");
        int i=1,j,k=1;
        while(i<=row) {
            j = 1;
            while (j <= (i + 1)) {
                if (j == 1 || j == (i + 1))
                    System.out.print(1 + " ");
                else System.out.print(2 + " ");
                j++;
            }
            i++;
            System.out.println("");
        }
    }
}
