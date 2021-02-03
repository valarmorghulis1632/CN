/** QUESTION -
 * Write a program to calculate the roots of a quadratic
 equation 2ax+bx+c=0, display them on the screen specifying
 their nature.
 */

package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Nature_Of_Roots {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE COEFFICIENTS a,b,c OF QUADRATIC EQUATION a(x^2)+bx+c: ");
        System.out.print("a = ");
        float a=scan.nextFloat();
        System.out.print("b = ");
        float b= scan.nextFloat();
        System.out.print("c = ");
        float c= scan.nextFloat();
        System.out.println("");
        double root1,root2,discriminant;
        discriminant=(Math.pow(b,2)-(4*a*c));
        if(discriminant>0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println(" ROOTS ARE REAL AND DISTINCT");
            System.out.println("ROOTS ARE: "+ root1+ " & "+root2);
        }
        else if(discriminant<0) {
            System.out.println(" ROOTS ARE IMAGINARY AND CONJUGATE OF ONE ANOTHER");
            System.out.print("ROOTS ARE: " + (-b / (2 * a)) + "+i" + ((Math.sqrt((-1) * discriminant)) / 2 * a)+" & ");
            System.out.println((-b / (2 * a)) + "-i" + ((Math.sqrt((-1) * discriminant)) / 2 * a));
        }
        else {
            System.out.println(" ROOTS ARE REAL AND EQUAL");
            root1 = -b / (2 * a);
            root2 = root1;
            System.out.println("ROOTS ARE: " + root1 + " & " + root2);
        }

    }
}

