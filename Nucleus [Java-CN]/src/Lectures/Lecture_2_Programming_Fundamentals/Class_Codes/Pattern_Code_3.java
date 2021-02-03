package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Pattern_Code_3 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number of rows");
        int row = s.nextInt();
        int i = 1, j,k=1;
        System.out.println("\nThe Output is: \n");
        while (i <= row) {
            j = 1;
            while (j <= i) {
                System.out.print(k+" ");
                j++;
                k++;
            }
            System.out.println("");
            i++;
        }


    }
}