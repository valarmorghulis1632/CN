/**QUESTION -
 * Reverse an array. Same array should be reversed
 */
package Lectures.Lecture_3_Functions_and_Arrays.Assignment_3_Arrays;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 14/06/2017.
 */
public class Reverse_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[20];
        System.out.print("ENTER THE LENGTH OF ARRAY: ");
        int array_length=scan.nextInt();
        System.out.print("\nENTER THE TERMS IN ARRAY: ");
        fill_array(array,array_length);
        rev_array(array,array_length);
        display_array(array,array_length);
    }

    public static void fill_array(int[] array,int array_length)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array_length) {
            System.out.print(" ");
            array[i] = scan.nextInt();
            i++;
        }
    }

    public static void rev_array(int[] array,int array_length)
    {
        int i=0;
        while(i<(array_length/2))
        {
            array[array_length-1-i]=array[i]-array[array_length-1-i];
            array[i]=array[i]-array[array_length-1-i];
            array[array_length-1-i]=array[i]+array[array_length-1-i];
            i++;
        }
    }

    public static void display_array(int[] array,int array_length)
    {
        int i=0;
        System.out.print("THE REVERSE OF GIVEN ARRAY IS: ");
        while(i<array_length)
        {
            System.out.print(array[i]+" ");
            i++;
        }
    }
}
