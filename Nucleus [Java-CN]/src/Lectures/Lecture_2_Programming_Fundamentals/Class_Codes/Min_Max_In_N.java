
package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Min_Max_In_N {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("ENTER THE TOTAL NUMBER OF DATA: ");
        int num = scan.nextInt();
        System.out.println("");
        int i=0,data;
        int large=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;
        while(i<num) {
            System.out.println("ENTER THE " + (i + 1) + " th Number: ");
            data = scan.nextInt();
                if (data >= large)
                    large = data;
                if (data <= small)
                    small = data;
            }
            System.out.println("");
            i++;
        System.out.println("THE LARGEST IS: "+large);
        System.out.println("THE SMALLEST IS: "+small);
    }
}
