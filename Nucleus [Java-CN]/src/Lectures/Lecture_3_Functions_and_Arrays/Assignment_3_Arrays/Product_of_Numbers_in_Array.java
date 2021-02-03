/**QUESTION -
 * Find product of all numbers in an array.
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Product_of_Numbers_in_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int arraylength=scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array,arraylength);
        int product=prod_of_num(array,arraylength);
        System.out.println("THE PRODUCT OF NUMBERS IN THE GIVEN ARRAY IS: "+product);
    }

    public static void fill_array(int[] array,int arraylength)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<arraylength) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static int prod_of_num(int[] array,int arraylength)
    {
        int i=0,prod=1;
        while(i<arraylength)
        {
            prod=prod*array[i];
            i++;
        }
        return prod;
    }
}
