/**
 * d. 12345
      1234
      123
      12
      1
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF ROWS: ");
        int row=scan.nextInt();
        System.out.println("");
        int i=1,j,k;
        while(i<=row) {
            k=1;
            j=row-i+1;
            while (j >= 1) {
                System.out.print(k + " ");
                k++;
                j--;
            }
            i++;
            System.out.println("");
        }

    }
}
