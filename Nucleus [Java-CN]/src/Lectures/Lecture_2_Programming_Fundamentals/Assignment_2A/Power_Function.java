/**QUESTION -
 * Write a program to find x^n. Take x and n from the user.
 */
package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import  java.util.Scanner;
public class Power_Function
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER X AND THE POWER TO WHICH ITS TO BE RAISED N: ");
        float x=scan.nextFloat();
        int n=scan.nextInt(),i=1;
        float equivalent=1.0f;   //final answer of x^n
        while(i<=n)
        {
            equivalent = equivalent * x;
            i++;
        }
        System.out.println("\nNumber "+x+" Raised to the Power "+n+" is: "+equivalent);
    }
}
